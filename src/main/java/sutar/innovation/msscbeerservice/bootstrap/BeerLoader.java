package sutar.innovation.msscbeerservice.bootstrap;

import org.springframework.boot.CommandLineRunner;
import sutar.innovation.msscbeerservice.domain.Beer;
import sutar.innovation.msscbeerservice.repositories.BeerRepository;

import java.math.BigDecimal;

public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        Beer beer = Beer.builder().beerName("KingFisher")
                .beerStyle("Cold")
                .minOnHand(12)
                .price(new BigDecimal(3322))
                .upc(233333L)
                .build();
    }
}
