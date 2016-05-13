package prashantwosti.aftershipsdk.tracking.singletracking;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prashantwosti on 5/13/2016.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Checkpoint {

    @JsonProperty("slug")
    private String slug;
    @JsonProperty("city")
    private String city;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("location")
    private String location;
    @JsonProperty("country_name")
    private Object countryName;
    @JsonProperty("message")
    private String message;
    @JsonProperty("country_iso3")
    private Object countryIso3;
    @JsonProperty("tag")
    private String tag;
    @JsonProperty("checkpoint_time")
    private String checkpointTime;
    @JsonProperty("coordinates")
    private List<Object> coordinates = new ArrayList<>();
    @JsonProperty("state")
    private Object state;
    @JsonProperty("zip")
    private Object zip;

    public Checkpoint() {
    }

    public String getCheckpointTime() {
        return checkpointTime;
    }

    public String getSlug() {
        return slug;
    }

    public String getCity() {
        return city;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getLocation() {
        return location;
    }

    public Object getCountryName() {
        return countryName;
    }

    public String getMessage() {
        return message;
    }

    public Object getCountryIso3() {
        return countryIso3;
    }

    public String getTag() {
        return tag;
    }

    public List<Object> getCoordinates() {
        return coordinates;
    }

    public Object getState() {
        return state;
    }

    public Object getZip() {
        return zip;
    }
}
