package uk.gov.hmcts.ecm.common.bulk.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class MidSearchTypeItem {

    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private String value;
}
