package com.skeleton.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.skeleton.R;

/**
 * Created by mark63 on 11/5/17.
 */

public class SignInFragement extends Fragment {
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_sign_in, container, false);
        return view;
    }
}
