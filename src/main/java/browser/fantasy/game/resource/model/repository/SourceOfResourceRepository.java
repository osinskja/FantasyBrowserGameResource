package browser.fantasy.game.resource.model.repository;

import browser.fantasy.game.resource.model.jpa.SourceOfResource;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceOfResourceRepository extends JpaRepository<SourceOfResource, UUID> {}
