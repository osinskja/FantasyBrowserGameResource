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
@Table(name = "player_resource")
public class PlayerResource {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private UUID id;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "player_id", nullable = false)
  private Player player;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "resource_id", nullable = false)
  private Resource resource;

  @Column(name = "amount", nullable = false)
  private Long amount;
}
