package eu.vranckaert.hello.auto;

import android.os.Bundle;

import com.google.android.apps.auto.sdk.CarActivity;

/**
 * Created by dirkvranckaert on 09/10/2017.
 */

public class HelloAndroidAutoActivity extends CarActivity {
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_hello_aa);

        getCarUiController().getStatusBarController().setTitle("Hello AA");
    }
}
