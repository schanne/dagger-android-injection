package iammert.com.dagger_android_injection.ui.detail;

import javax.inject.Inject;

import iammert.com.dagger_android_injection.data.ApiService;

/**
 * Created by mertsimsek on 30/05/2017.
 */

public class ConfigPresenterImpl implements ConfigPresenter{

    ConfigView configView;
    ApiService apiService;

    @Inject
    public ConfigPresenterImpl(ConfigView configView, ApiService apiService) {
        this.configView = configView;
        this.apiService = apiService;
    }

    public void loadDetail(){
        apiService.loadData();
        configView.onDetailLoaded();
    }
}
