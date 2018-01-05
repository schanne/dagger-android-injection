package iammert.com.dagger_android_injection.ui.config;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import iammert.com.dagger_android_injection.data.ConfigModel;

/**
 * Created by mertsimsek on 30/05/2017.
 */
@Module
public abstract class ConfigActivityModule {

    @Provides
    static ConfigPresenter provideConfigPresenter(ConfigView view, ConfigModel apiService) {
        return new ConfigPresenterImpl(view, apiService);
    }

    @Binds
    abstract ConfigView provideConfigView(ConfigActivity activity);
}
