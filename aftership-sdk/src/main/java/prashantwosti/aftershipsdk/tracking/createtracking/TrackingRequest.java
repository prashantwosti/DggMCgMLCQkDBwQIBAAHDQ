package prashantwosti.aftershipsdk.tracking.createtracking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by prashantwosti on 5/13/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackingRequest {

    @JsonProperty("tracking")
    private TrackingData trackingData;

    public TrackingRequest(TrackingData trackingData) {
        this.trackingData = trackingData;
    }

    public TrackingData getTrackingData() {
        return trackingData;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TrackingData {
        @JsonProperty("tracking_number")
        private String trackingNumber;

        public TrackingData(String trackingNumber) {
            this.trackingNumber = trackingNumber;
        }

    }
}
