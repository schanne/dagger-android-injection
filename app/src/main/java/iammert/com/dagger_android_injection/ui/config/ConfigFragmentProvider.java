package iammert.com.dagger_android_injection.ui.config;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import iammert.com.dagger_android_injection.ui.config.fragment.ConfigFragment;
import iammert.com.dagger_android_injection.ui.config.fragment.ConfigFragmentModule;

/**
 * Created by mertsimsek on 02/06/2017.
 */
@Module
public abstract class ConfigFragmentProvider {

    @ContributesAndroidInjector(modules = ConfigFragmentModule.class)
    abstract ConfigFragment provideConfigFragmentFactory();
}
