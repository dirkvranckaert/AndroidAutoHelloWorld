package eu.vranckaert.hello.auto;

import com.google.android.apps.auto.sdk.CarActivity;
import com.google.android.apps.auto.sdk.CarActivityService;

/**
 * Created by dirkvranckaert on 09/10/2017.
 */

public class HelloAndroidAutoActivityService extends CarActivityService {
    @Override
    public Class<? extends CarActivity> getCarActivity() {
        return HelloAndroidAutoActivity.class;
    }
}
