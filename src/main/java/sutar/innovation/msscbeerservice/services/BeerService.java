package sutar.innovation.msscbeerservice.services;


import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import sutar.innovation.msscbeerservice.domain.Beer;
import sutar.innovation.msscbeerservice.web.model.BeerDTO;
import sutar.innovation.msscbeerservice.web.model.BeerPagedList;
import sutar.innovation.msscbeerservice.web.model.BeerStyleEnum;

import java.util.UUID;

public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

    BeerDTO getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDTO saveNewBeer(BeerDTO beerDto);

    BeerDTO updateBeer(UUID beerId, BeerDTO beerDto);

    BeerDTO getByUpc(String upc);
}