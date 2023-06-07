package browser.fantasy.game.resource.model.repository;

import browser.fantasy.game.resource.model.jpa.PlayerSourceOfResource;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerSourceOfResourceRepository
    extends JpaRepository<PlayerSourceOfResource, UUID> {}
