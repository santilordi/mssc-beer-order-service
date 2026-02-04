package guru.sfg.brewery.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class CustomerPagedList extends PageImpl<CustomerDto> implements Serializable {

    private static final long serialVersionUID = 1114715136625836949L;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public CustomerPagedList(@JsonProperty("content") List<CustomerDto> content,
                             @JsonProperty("pageable") Pageable pageable,
                             @JsonProperty("total") long total) {
        super(content, pageable, total);
    }
}
