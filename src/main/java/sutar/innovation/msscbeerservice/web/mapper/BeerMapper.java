package sutar.innovation.msscbeerservice.web.mapper;

import sutar.innovation.msscbeerservice.domain.Beer;
import sutar.innovation.msscbeerservice.web.model.BeerDTO;

import java.util.UUID;

public class BeerMapper {

    public BeerDTO beerToBeerDto(UUID uuid)
    {

        return BeerDTO.builder().build();
    }

    public <R> R beerToBeerDtoWithInventory(Beer beer) {
    }
}
