package prashantwosti.aftershipsdk;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import prashantwosti.aftershipsdk.tracking.AfterShipApi;
import prashantwosti.aftershipsdk.tracking.createtracking.CreateTrackingResponse;
import prashantwosti.aftershipsdk.tracking.createtracking.TrackingRequest;
import prashantwosti.aftershipsdk.tracking.singletracking.TrackingDetailData;


/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest extends TestCase {

    AfterShip afterShip;

    @Mock
    AfterShipApi api;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        afterShip = new AfterShip("e624c6d3-1c27-4f16-9be9-70712cdbacab");
    }

    @Test
    public void shouldPrintResponseFromSingleTrackingApi() throws Exception {
        Assert.assertNotNull(afterShip);
        afterShip.getSingleTrackingResult("sf-express", "070630669263",
                new AfterShip.OnSingleTrackingResultCallback() {
            @Override
            public void onSuccess(TrackingDetailData response) {
                Assert.assertNotNull(response.getTracking());

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }

    @Test
    public void shouldPrintResponseFromCreateTrackingApi() throws Exception {
        afterShip.createTracking(new TrackingRequest.TrackingData("070630669263"),
                new AfterShip.OnCreateTrackingCallback() {
            @Override
            public void onSuccess(CreateTrackingResponse.Data response) {
                Assert.assertNotNull(response.getTracking());
            }

            @Override
            public void onFailure(Throwable t) {
                Assert.fail(t.toString());
            }
        });
    }

}