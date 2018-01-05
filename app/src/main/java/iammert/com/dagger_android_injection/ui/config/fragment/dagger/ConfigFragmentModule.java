package iammert.com.dagger_android_injection.ui.config.fragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mertsimsek on 02/06/2017.
 */
@Module
public class ConfigFragmentModule {

    @Provides
    ConfigFragmentView provideConfigFragmentView(ConfigFragment ConfigFragment){
        return ConfigFragment;
    }

}
