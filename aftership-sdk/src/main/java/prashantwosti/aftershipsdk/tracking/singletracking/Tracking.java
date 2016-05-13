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
public class Tracking {

    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("last_updated_at")
    private String lastUpdatedAt;
    @JsonProperty("tracking_number")
    private String trackingNumber;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("active")
    private boolean active;
    @JsonProperty("android")
    private List<Object> android = new ArrayList<>();
    @JsonProperty("custom_fields")
    private Object customFields;
    @JsonProperty("customer_name")
    private Object customerName;
    @JsonProperty("delivery_time")
    private long deliveryTime;
    @JsonProperty("destination_country_iso3")
    private Object destinationCountryIso3;
    @JsonProperty("emails")
    private List<Object> emails = new ArrayList<>();
    @JsonProperty("expected_delivery")
    private Object expectedDelivery;
    @JsonProperty("ios")
    private List<Object> ios = new ArrayList<Object>();
    @JsonProperty("note")
    private Object note;
    @JsonProperty("order_id")
    private String orderId;
    @JsonProperty("order_id_path")
    private String orderIdPath;
    @JsonProperty("origin_country_iso3")
    private Object originCountryIso3;
    @JsonProperty("shipment_package_count")
    private long shipmentPackageCount;
    @JsonProperty("shipment_pickup_date")
    private String shipmentPickupDate;
    @JsonProperty("shipment_delivery_date")
    private String shipmentDeliveryDate;
    @JsonProperty("shipment_type")
    private Object shipmentType;
    @JsonProperty("shipment_weight")
    private Object shipmentWeight;
    @JsonProperty("shipment_weight_unit")
    private Object shipmentWeightUnit;
    @JsonProperty("signed_by")
    private Object signedBy;
    @JsonProperty("smses")
    private List<Object> smses = new ArrayList<Object>();
    @JsonProperty("source")
    private String source;
    @JsonProperty("tag")
    private String tag;
    @JsonProperty("title")
    private String title;
    @JsonProperty("tracked_count")
    private long trackedCount;
    @JsonProperty("unique_token")
    private String uniqueToken;
    @JsonProperty("checkpoints")
    private List<Checkpoint> checkpoints = new ArrayList<>();
    @JsonProperty("tracking_account_number")
    private Object trackingAccountNumber;
    @JsonProperty("tracking_destination_country")
    private Object trackingDestinationCountry;
    @JsonProperty("tracking_key")
    private Object trackingKey;
    @JsonProperty("tracking_postal_code")
    private Object trackingPostalCode;
    @JsonProperty("tracking_ship_date")
    private Object trackingShipDate;

    public Tracking() {
    }

    public Object getTrackingDestinationCountry() {
        return trackingDestinationCountry;
    }

    public String getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public String getSlug() {
        return slug;
    }

    public boolean isActive() {
        return active;
    }

    public List<Object> getAndroid() {
        return android;
    }

    public Object getCustomFields() {
        return customFields;
    }

    public Object getCustomerName() {
        return customerName;
    }

    public long getDeliveryTime() {
        return deliveryTime;
    }

    public Object getDestinationCountryIso3() {
        return destinationCountryIso3;
    }

    public List<Object> getEmails() {
        return emails;
    }

    public Object getExpectedDelivery() {
        return expectedDelivery;
    }

    public List<Object> getIos() {
        return ios;
    }

    public Object getNote() {
        return note;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderIdPath() {
        return orderIdPath;
    }

    public Object getOriginCountryIso3() {
        return originCountryIso3;
    }

    public long getShipmentPackageCount() {
        return shipmentPackageCount;
    }

    public String getShipmentPickupDate() {
        return shipmentPickupDate;
    }

    public String getShipmentDeliveryDate() {
        return shipmentDeliveryDate;
    }

    public Object getShipmentType() {
        return shipmentType;
    }

    public Object getShipmentWeight() {
        return shipmentWeight;
    }

    public Object getShipmentWeightUnit() {
        return shipmentWeightUnit;
    }

    public Object getSignedBy() {
        return signedBy;
    }

    public List<Object> getSmses() {
        return smses;
    }

    public String getSource() {
        return source;
    }

    public String getTag() {
        return tag;
    }

    public String getTitle() {
        return title;
    }

    public long getTrackedCount() {
        return trackedCount;
    }

    public String getUniqueToken() {
        return uniqueToken;
    }

    public List<Checkpoint> getCheckpoints() {
        return checkpoints;
    }

    public Object getTrackingAccountNumber() {
        return trackingAccountNumber;
    }

    public Object getTrackingKey() {
        return trackingKey;
    }

    public Object getTrackingPostalCode() {
        return trackingPostalCode;
    }

    public Object getTrackingShipDate() {
        return trackingShipDate;
    }
}
