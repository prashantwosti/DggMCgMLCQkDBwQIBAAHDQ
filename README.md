# Aftership SDK for Android

- First get your API KEY by signing up here: https://secure.aftership.com/signup

- Create an instance.
		
		AfterShip afterShip = new AfterShip(YOUR_API_KEY);

**Get tracking results of a single tracking.**

	afterShip.getSingleTrackingResult("SLUG", "TRACKING_NUMBER",
                new AfterShip.OnSingleTrackingResultCallback() {

                    @Override
                    public void onSuccess(TrackingDetailData response) {
                        // do your thing here!
                    }

                    @Override
                    public void onFailure(Throwable t) {
                        // do your thing here!
                    }
                });

**Create a tracking.**

	afterShip.createTracking(new TrackingRequest.TrackingData("TRACKING_NUMBER"),
                new AfterShip.OnCreateTrackingCallback() {
                    @Override
                    public void onSuccess(CreateTrackingResponse.Data response) {
                        // do your thing here!
                    }

                    @Override
                    public void onFailure(Throwable t) {
                        // do your thing here!
                    }
                });

For more info, see: https://www.aftership.com/docs/api/4/overview

