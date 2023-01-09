package android.OneSignalSDK.onesignal.src.main.java.com.onesignal.outcomes.domain;

import com.onesignal.OneSignalApiResponseHandler;

import org.json.JSONObject;

public interface OutcomeEventsService {

    void sendOutcomeEvent(JSONObject object, OneSignalApiResponseHandler responseHandler);

}
