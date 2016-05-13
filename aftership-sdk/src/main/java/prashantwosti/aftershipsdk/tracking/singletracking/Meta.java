package prashantwosti.aftershipsdk.tracking.singletracking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by prashantwosti on 5/13/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta {

    @JsonProperty("code")
    private long code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("type")
    private String type;

    public Meta() {
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public long getCode() {
        return code;
    }
}
