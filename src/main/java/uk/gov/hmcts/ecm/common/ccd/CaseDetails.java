package uk.gov.hmcts.ecm.common.ccd;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import uk.gov.hmcts.ecm.common.generic.GenericCaseDetails;

@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CaseDetails extends GenericCaseDetails {

    @JsonProperty("case_data")
    private CaseData caseData;
}
