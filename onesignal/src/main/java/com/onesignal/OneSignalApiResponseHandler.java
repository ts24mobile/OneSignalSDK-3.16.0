package android.OneSignalSDK.onesignal.src.main.java.com.onesignal;

public interface OneSignalApiResponseHandler {
    void onSuccess(String response);

    void onFailure(int statusCode, String response, Throwable throwable);
}