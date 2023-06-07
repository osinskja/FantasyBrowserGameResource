package browser.fantasy.game.resource.model.repository;

import browser.fantasy.game.resource.model.jpa.PlayerResource;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerResourceRepository extends JpaRepository<PlayerResource, UUID> {

  List<PlayerResource> findByPlayerId(UUID playerId);
}
