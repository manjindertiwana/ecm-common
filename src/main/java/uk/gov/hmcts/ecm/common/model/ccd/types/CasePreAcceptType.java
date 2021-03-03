package uk.gov.hmcts.ecm.common.model.ccd.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import uk.gov.hmcts.ecm.common.model.ccd.Document;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CasePreAcceptType {

    @JsonProperty("caseJudge")
    private String caseJudge;
    @JsonProperty("caseEJReferredDate")
    private String caseEJReferredDate;
    @JsonProperty("preAcceptOutcome")
    private String preAcceptOutcome;
    @JsonProperty("preAcceptOutcomeDoc")
    private Document preAcceptOutcomeDoc;
    @JsonProperty("caseEJReferredDateReturn")
    private String caseEJReferredDateReturn;
    @JsonProperty("caseAccepted")
    private String caseAccepted;
    @JsonProperty("dateAccepted")
    private String dateAccepted;
    @JsonProperty("partRejected")
    private String partRejected;
    @JsonProperty("rejectReason")
    private String[] rejectReason;
    @JsonProperty("dateRejected")
    private String dateRejected;

}
