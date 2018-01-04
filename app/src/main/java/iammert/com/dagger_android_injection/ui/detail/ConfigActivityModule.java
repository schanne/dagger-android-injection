package iammert.com.dagger_android_injection.ui.detail;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import iammert.com.dagger_android_injection.data.ApiService;

/**
 * Created by mertsimsek on 30/05/2017.
 */
@Module
public abstract class ConfigActivityModule {

    @Provides
    static ConfigPresenter provideDetailPresenter(ConfigView configView, ApiService apiService) {
        return new ConfigPresenterImpl(configView, apiService);
    }

    @Binds
    abstract ConfigView provideconfigView(ConfigActivity detailActivity);
}
