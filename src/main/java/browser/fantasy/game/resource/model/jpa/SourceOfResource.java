package browser.fantasy.game.resource.model.jpa;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "source_of_resource")
public class SourceOfResource {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private UUID id;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "resource_id", nullable = false)
  private Resource resource;

  @Column(name = "production_increase_per_level", nullable = false)
  private Long productionIncreasePerLevel;

  @OneToMany(mappedBy = "sourceOfResource", orphanRemoval = true)
  private Set<SourceOfResourceCost> sourceOfResourceCosts = new LinkedHashSet<>();

  @OneToMany(mappedBy = "sourceOfResource", orphanRemoval = true)
  private Set<PlayerSourceOfResource> playerSourceOfResources = new LinkedHashSet<>();
}
