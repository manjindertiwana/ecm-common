package uk.gov.hmcts.ecm.common.ccd.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.ecm.common.ccd.types.JurCodesType;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class JurCodesTypeItem {

    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private JurCodesType value;
}
