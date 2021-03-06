package uk.gov.hmcts.ecm.common.model.bulk.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class DynamicValueType {

    private String code;
    private String label;

    DynamicValueType(String code, String label) {
        this.code = code;
        this.label = label;
    }

    public DynamicValueType() {}
}
