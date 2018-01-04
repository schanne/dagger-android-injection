package iammert.com.dagger_android_injection.ui.config.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

/**
 * Created by mertsimsek on 02/06/2017.
 */

public class ConfigFragment extends DaggerFragment implements ConfigFragmentView {

    @Inject
    ConfigFragmentPresenter ConfigFragmentPresenter;

    public static ConfigFragment newInstance() {
        Bundle args = new Bundle();
        ConfigFragment fragment = new ConfigFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onConfigFragmentLoaded() {
        Log.v("TEST", "OnConfigFragmentLoaded.");
    }
}
