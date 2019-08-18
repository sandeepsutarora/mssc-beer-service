package sutar.innovation.msscbeerservice.web.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import sutar.innovation.msscbeerservice.domain.Beer;
import sutar.innovation.msscbeerservice.web.model.BeerDTO;

/**
 * Created by jt on 2019-06-08.
 */
public abstract class BeerMapperDecorator implements BeerMapper {
    private BeerInventoryService beerInventoryService;
    private BeerMapper mapper;

    @Autowired
    public void setBeerInventoryService(BeerInventoryService beerInventoryService) {
        this.beerInventoryService = beerInventoryService;
    }

    @Autowired
    public void setMapper(BeerMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public BeerDTO beerToBeerDto(Beer beer) {
        return mapper.beerToBeerDto(beer);
    }

    @Override
    public BeerDTO beerToBeerDtoWithInventory(Beer beer) {
        BeerDTO dto = mapper.beerToBeerDto(beer);
        dto.setQuantityOnHand(beerInventoryService.getOnhandInventory(beer.getId()));
        return dto;
    }

    @Override
    public Beer beerDtoToBeer(BeerDTO beerDto) {
        return mapper.beerDtoToBeer(beerDto);
    }
}