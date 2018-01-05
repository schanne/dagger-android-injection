package iammert.com.dagger_android_injection.ui.config;

import javax.inject.Inject;

import iammert.com.dagger_android_injection.data.ConfigModel;

/**
 * Created by mertsimsek on 30/05/2017.
 */

public class ConfigPresenterImpl implements ConfigPresenter{

    ConfigView view;
    ConfigModel model;

    @Inject
    public ConfigPresenterImpl(ConfigView view, ConfigModel model) {
        this.view = view;
        this.model = model;
    }

    public void loadConfig(){
        model.loadData();
        view.onConfigLoaded();
    }
}
