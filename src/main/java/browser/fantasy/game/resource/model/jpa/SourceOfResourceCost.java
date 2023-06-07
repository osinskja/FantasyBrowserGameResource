package browser.fantasy.game.resource.model.jpa;

import java.util.UUID;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "source_of_resource_cost")
public class SourceOfResourceCost {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private UUID id;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "resource_id", nullable = false)
  private Resource resource;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "source_of_resource_id", nullable = false)
  private SourceOfResource sourceOfResource;

  @Column(name = "amount", nullable = false)
  private Long amount;

  @Column(name = "cost_increase_per_level", nullable = false)
  private Long costIncreasePerLevel;
}
