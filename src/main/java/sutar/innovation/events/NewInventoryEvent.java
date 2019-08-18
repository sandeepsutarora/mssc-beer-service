package sutar.innovation.events;

import lombok.NoArgsConstructor;
import sutar.innovation.msscbeerservice.web.model.BeerDTO;

@NoArgsConstructor
public class NewInventoryEvent extends  BeerEvent{
    public NewInventoryEvent(BeerDTO beerDTO) {
        super(beerDTO);
    }
}
