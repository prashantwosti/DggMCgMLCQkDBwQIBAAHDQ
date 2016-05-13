package prashantwosti.aftershipsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import prashantwosti.aftershipsdk.AfterShip;
import prashantwosti.aftershipsdk.tracking.createtracking.CreateTrackingResponse;
import prashantwosti.aftershipsdk.tracking.createtracking.TrackingRequest;
import prashantwosti.aftershipsdk.tracking.singletracking.TrackingDetailData;

public class MainActivity extends AppCompatActivity {

    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AfterShip afterShip = new AfterShip(BuildConfig.API_KEY);

        afterShip.getSingleTrackingResult("sf-express", "070630669263",
                new AfterShip.OnSingleTrackingResultCallback() {

                    @Override
                    public void onSuccess(TrackingDetailData response) {
                        Log.d(TAG, "getTrackingDetail: " + response.getTracking().getSlug());
                    }

                    @Override
                    public void onFailure(Throwable t) {
                        Log.e(TAG, "getTrackingDetail: " + t.getLocalizedMessage());
                    }
                });


        afterShip.createTracking(new TrackingRequest.TrackingData("070630669263"),
                new AfterShip.OnCreateTrackingCallback() {
                    @Override
                    public void onSuccess(CreateTrackingResponse.Data response) {
                        Log.d(TAG, "postTrackingData" + response);
                    }

                    @Override
                    public void onFailure(Throwable t) {
                        Log.e(TAG, "postTrackingData: " + t.getLocalizedMessage());
                    }
                });

    }
}
