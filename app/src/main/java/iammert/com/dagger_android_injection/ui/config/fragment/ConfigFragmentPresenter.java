package iammert.com.dagger_android_injection.ui.config.fragment;

import javax.inject.Inject;

/**
 * Created by mertsimsek on 02/06/2017.
 */

public class ConfigFragmentPresenter {

    ConfigFragmentView configFragmentView;

    @Inject
    public ConfigFragmentPresenter(ConfigFragmentView ConfigFragmentView) {
        this.configFragmentView = ConfigFragmentView;
        ConfigFragmentView.onConfigFragmentLoaded();
    }
}
