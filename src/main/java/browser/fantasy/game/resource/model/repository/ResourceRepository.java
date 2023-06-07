package browser.fantasy.game.resource.model.repository;

import browser.fantasy.game.resource.model.jpa.Resource;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, UUID> {}
