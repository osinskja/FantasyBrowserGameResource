package browser.fantasy.game.resource.service;

import browser.fantasy.game.resource.PlayerResourceDto;
import browser.fantasy.game.resource.model.repository.PlayerResourceRepository;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class PlayerResourceService {

  private final PlayerResourceRepository playerResourceRepository;

  public PlayerResourceService(PlayerResourceRepository playerResourceRepository) {
    this.playerResourceRepository = playerResourceRepository;
  }

  public List<PlayerResourceDto> getPlayerResources(String playerId) {
    return playerResourceRepository.findByPlayerId(UUID.fromString(playerId)).stream()
        .map(
            playerResource ->
                new PlayerResourceDto()
                    .withPlayerName(playerResource.getPlayer().getName())
                    .withAmount(playerResource.getAmount())
                    .withResourceName(playerResource.getResource().getName()))
        .collect(Collectors.toList());
  }
}
