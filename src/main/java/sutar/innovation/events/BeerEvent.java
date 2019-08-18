package sutar.innovation.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sutar.innovation.msscbeerservice.web.model.BeerDTO;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {
    static final long serialVersionUID = -5845482555554545L;
    private BeerDTO beerDTO;
}
