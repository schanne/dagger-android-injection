package iammert.com.dagger_android_injection.ui.config;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import iammert.com.dagger_android_injection.R;
import iammert.com.dagger_android_injection.ui.config.fragment.ConfigFragment;

/**
 * Created by mertsimsek on 25/05/2017.
 */

public class ConfigActivity extends DaggerAppCompatActivity implements ConfigView {

    @Inject
    ConfigPresenter configPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
        configPresenter.loadConfig();

        if (savedInstanceState == null)
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, ConfigFragment.newInstance())
                    .commitAllowingStateLoss();
    }

    @Override
    public void onConfigLoaded() {
        Log.v("TEST", "Config is loaded");
    }

}
