package prashantwosti.aftershipsdk.tracking.createtracking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import prashantwosti.aftershipsdk.tracking.singletracking.Meta;

/**
 * Created by prashantwosti on 5/13/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateTrackingResponse {

    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("data")
    private Data trackingDetailData;

    public CreateTrackingResponse() {
    }

    public Meta getMeta() {
        return meta;
    }

    public Data getTrackingDetailData() {
        return trackingDetailData;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Data {
        @JsonProperty("tracking")
        private Tracking tracking;

        public Data() {
        }

        public Tracking getTracking() {
            return tracking;
        }

        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonIgnoreProperties(ignoreUnknown = true)
        public class Tracking {

            @JsonProperty("tracking_number")
            private String trackingNumber;
            @JsonProperty("slug")
            private String slug;
            @JsonProperty("id")
            private String id;

            public Tracking() {
            }

            public String getTrackingNumber() {
                return trackingNumber;
            }

            public String getSlug() {
                return slug;
            }

            public String getId() {
                return id;
            }
        }
    }
}
