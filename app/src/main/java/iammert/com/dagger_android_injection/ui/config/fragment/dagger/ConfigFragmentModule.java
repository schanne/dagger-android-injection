package iammert.com.dagger_android_injection.ui.config.fragment.dagger;

import dagger.Module;
import dagger.Provides;
import iammert.com.dagger_android_injection.ui.config.fragment.ConfigFragment;
import iammert.com.dagger_android_injection.ui.config.fragment.ConfigFragmentView;

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
