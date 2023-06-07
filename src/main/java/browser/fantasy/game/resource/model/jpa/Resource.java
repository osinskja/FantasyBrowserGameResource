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
@Table(name = "resource")
public class Resource {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private UUID id;

  @Column(name = "name", nullable = false)
  private String name;

  @OneToMany(mappedBy = "resource", orphanRemoval = true)
  private Set<SourceOfResource> sourceOfResources = new LinkedHashSet<>();

  @OneToMany(mappedBy = "resource", orphanRemoval = true)
  private Set<SourceOfResourceCost> sourceOfResourceCosts = new LinkedHashSet<>();

  @OneToMany(mappedBy = "resource", orphanRemoval = true)
  private Set<PlayerResource> playerResources = new LinkedHashSet<>();
}
