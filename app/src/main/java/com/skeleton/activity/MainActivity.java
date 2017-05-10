package com.skeleton.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.skeleton.R;
import com.skeleton.fragment.SignUpAndSignInFragement;

/**
 * main activity
 */
public class MainActivity extends BaseActivity {
    private SignUpAndSignInFragement signUpAndSignInFragement = new SignUpAndSignInFragement();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frameLayout, signUpAndSignInFragement);
        ft.commit();
    }
}
