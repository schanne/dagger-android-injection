package iammert.com.dagger_android_injection.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import iammert.com.dagger_android_injection.ui.detail.ConfigFragmentProvider;
import iammert.com.dagger_android_injection.ui.detail.ConfigActivity;
import iammert.com.dagger_android_injection.ui.detail.ConfigActivityModule;
import iammert.com.dagger_android_injection.ui.main.MainActivity;
import iammert.com.dagger_android_injection.ui.main.MainActivityModule;

/**
 * Created by mertsimsek on 25/05/2017.
 */
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector(modules = {ConfigActivityModule.class, ConfigFragmentProvider.class})
    abstract ConfigActivity bindDetailActivity();

}
