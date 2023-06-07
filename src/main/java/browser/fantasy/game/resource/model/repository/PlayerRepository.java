package browser.fantasy.game.resource.model.repository;

import browser.fantasy.game.resource.model.jpa.Player;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, UUID> {}
