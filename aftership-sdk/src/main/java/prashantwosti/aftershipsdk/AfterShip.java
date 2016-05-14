package prashantwosti.aftershipsdk;

import prashantwosti.aftershipsdk.tracking.AfterShipApi;
import prashantwosti.aftershipsdk.tracking.RetrofitFactory;
import prashantwosti.aftershipsdk.tracking.createtracking.CreateTrackingResponse;
import prashantwosti.aftershipsdk.tracking.createtracking.TrackingRequest;
import prashantwosti.aftershipsdk.tracking.singletracking.TrackingDetailData;
import prashantwosti.aftershipsdk.tracking.singletracking.SingleTrackingResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by prashantwosti on 5/13/2016.
 */

/**
 * AfterShip Factory class containing all the api connections
 */
public class AfterShip {

    private String apiKey;
    private AfterShipApi api;

    /**
     * @param apiKey apikey from AfterShip.
     * @throws RuntimeException if key is null or empty.
     */
    public AfterShip(String apiKey) {
        if (!apiKey.isEmpty()) {
            this.apiKey = apiKey;
            api = init();
        } else {
            throw new RuntimeException("must have valid AfterShip API Key.");
        }
    }

    /**
     * Initializes service adapter.
     */
    private AfterShipApi init() {
        Retrofit retrofit = new RetrofitFactory(apiKey).getAdapter();
        return retrofit.create(AfterShipApi.class);
    }

    /**
     * Service to get tracking results of a single tracking.
     *
     * @param slug           - slug name of carrier.
     * @param trackingNumber tracking number.
     * @param callback       Listener interface
     */
    public void getSingleTrackingResult(String slug, String trackingNumber,
                                        final OnSingleTrackingResultCallback callback) {
        api.getTrackingDetail(slug, trackingNumber).enqueue(new Callback<SingleTrackingResponse>() {
            @Override
            public void onResponse(Call<SingleTrackingResponse> call,
                                   Response<SingleTrackingResponse> response) {
                if (response.isSuccessful()) {
                    if (callback != null)
                        callback.onSuccess(response.body().getTrackingDetailData());
                }

            }

            @Override
            public void onFailure(Call<SingleTrackingResponse> call, Throwable t) {
                if (callback != null) callback.onFailure(t);
            }
        });
    }

    /**
     * Service that create a tracking
     *
     * @param request  {@link TrackingRequest}
     * @param callback {@link OnCreateTrackingCallback} interface
     */
    public void createTracking(final TrackingRequest.TrackingData request, final OnCreateTrackingCallback callback) {
        api.postTracking(new TrackingRequest(request)).enqueue(new Callback<CreateTrackingResponse>() {
            @Override
            public void onResponse(Call<CreateTrackingResponse> call, Response<CreateTrackingResponse> response) {
                if (response.isSuccessful()) {
                    if (callback != null) callback.onSuccess(response.body().getTrackingDetailData());
                }else{
                    if (callback != null) callback.onFailure(new Throwable(response.message()));
                }
            }

            @Override
            public void onFailure(Call<CreateTrackingResponse> call, Throwable t) {
                if (callback != null) callback.onFailure(t);
            }
        });
    }

    /**
     * Communicates {@link SingleTrackingResponse} from a server to UI thread.
     * Gets invoked in response to a given request.
     */
    public interface OnSingleTrackingResultCallback {
        /**
         * Success method
         *
         * @param response Success response
         */
        void onSuccess(TrackingDetailData response);

        /**
         * Failure method
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }

    /**
     * Communicates {@link OnCreateTrackingCallback} from a server.
     * Gets invoked in response to a given request.
     */
    public interface OnCreateTrackingCallback {
        /**
         * Success method
         *
         * @param response Success response
         */
        void onSuccess(CreateTrackingResponse.Data response);

        /**
         * Failure method
         *
         * @param t Throwable
         */
        void onFailure(Throwable t);
    }

}
