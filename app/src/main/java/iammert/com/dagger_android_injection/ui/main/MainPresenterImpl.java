package iammert.com.dagger_android_injection.ui.main;

import javax.inject.Inject;

import iammert.com.dagger_android_injection.data.ConfigModel;

/**
 * Created by mertsimsek on 25/05/2017.
 */

public class MainPresenterImpl implements MainPresenter{
    MainView mainView;
    ConfigModel apiService;

    @Inject
    public MainPresenterImpl(MainView mainView, ConfigModel apiService) {
        this.mainView = mainView;
        this.apiService = apiService;
    }

    public void loadMain(){
        apiService.loadData();
        mainView.onMainLoaded();
    }
}
