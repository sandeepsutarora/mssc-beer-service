package sutar.innovation.msscbeerservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BeerPagedList extends PageImpl<BeerDTO> {
    public BeerPagedList(List<BeerDTO> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    //this is latest change
    //this is another change
    public BeerPagedList(List<BeerDTO> content) {
        super(content);
    }
}
