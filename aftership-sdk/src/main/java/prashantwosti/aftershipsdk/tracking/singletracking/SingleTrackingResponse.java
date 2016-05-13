package prashantwosti.aftershipsdk.tracking.singletracking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by prashantwosti on 5/13/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SingleTrackingResponse {

    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("data")
    private TrackingDetailData trackingDetailData;

    public SingleTrackingResponse() {
    }

    public TrackingDetailData getTrackingDetailData() {
        return trackingDetailData;
    }

    public Meta getMeta() {
        return meta;
    }
}
