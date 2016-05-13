package prashantwosti.aftershipsdk.tracking.singletracking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by prashantwosti on 5/13/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackingDetailData {

    @JsonProperty("tracking")
    private Tracking tracking;

    public TrackingDetailData() {
    }

    public Tracking getTracking() {
        return tracking;
    }
}
