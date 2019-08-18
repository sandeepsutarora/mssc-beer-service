package sutar.innovation.events;

import sutar.innovation.msscbeerservice.web.model.BeerDTO;

public class BrewBeerEvent extends  BeerEvent{
    BeerDTO beerDTO;
    public BrewBeerEvent(BeerDTO beerDTO)
    {
        super(beerDTO);
        this.beerDTO=beerDTO;
    }
    public BeerDTO getBeerDto()
    {
        return beerDTO;
    }
}
