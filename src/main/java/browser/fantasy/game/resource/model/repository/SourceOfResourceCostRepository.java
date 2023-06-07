package browser.fantasy.game.resource.model.repository;

import browser.fantasy.game.resource.model.jpa.SourceOfResourceCost;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceOfResourceCostRepository extends JpaRepository<SourceOfResourceCost, UUID> {}
