package prashantwosti.aftershipsdk.tracking;

import prashantwosti.aftershipsdk.tracking.createtracking.CreateTrackingResponse;
import prashantwosti.aftershipsdk.tracking.createtracking.TrackingRequest;
import prashantwosti.aftershipsdk.tracking.singletracking.SingleTrackingResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by prashantwosti on 5/13/2016.
 */

/**
 * AfterShip API collection interface.
 */
public interface AfterShipAPI {

    @GET("trackings/{slug}/{tracking_number}/")
    Call<SingleTrackingResponse> getTrackingDetail(
            @Path("slug") String slug,
            @Path("tracking_number") String trackingNumber
    );

    @POST("trackings/")
    Call<CreateTrackingResponse> postTracking(@Body TrackingRequest request);

}
