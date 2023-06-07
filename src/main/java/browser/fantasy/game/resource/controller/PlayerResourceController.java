package browser.fantasy.game.resource.controller;

import browser.fantasy.game.resource.PlayerResourceDto;
import browser.fantasy.game.resource.service.PlayerResourceService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerResourceController {

  private final PlayerResourceService playerResourceService;

  public PlayerResourceController(PlayerResourceService playerResourceService) {
    this.playerResourceService = playerResourceService;
  }

  @GetMapping("/playerResources/{playerId}")
  public List<PlayerResourceDto> getPlayerResources(@PathVariable String playerId) {
    return playerResourceService.getPlayerResources(playerId);
  }
}
