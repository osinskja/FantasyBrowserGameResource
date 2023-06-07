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
@Table(name = "player")
public class Player {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private UUID id;

  @Column(name = "name", nullable = false, unique = true)
  private String name;

  @Column(name = "password", nullable = false)
  private String password;

  @OneToMany(mappedBy = "player", orphanRemoval = true)
  private Set<PlayerResource> playerResources = new LinkedHashSet<>();

  @OneToMany(mappedBy = "player", orphanRemoval = true)
  private Set<PlayerSourceOfResource> playerSourceOfResources = new LinkedHashSet<>();
}
