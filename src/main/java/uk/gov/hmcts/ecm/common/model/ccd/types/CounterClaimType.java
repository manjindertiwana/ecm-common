package uk.gov.hmcts.ecm.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CounterClaimType {

    @JsonProperty("counterClaimQuestion")
    private String counterClaimQuestion;
    @JsonProperty("counterClaimDate")
    private String counterClaimDate;
    @JsonProperty("counterClaimDetails")
    private String counterClaimDetails;
}
