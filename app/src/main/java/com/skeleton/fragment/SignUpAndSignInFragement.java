package com.skeleton.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.skeleton.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mark63 on 10/5/17.
 */

public class SignUpAndSignInFragement extends Fragment {
    private TabLayout tabLayout;
    private List<Fragment> fragments = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_sign_up_sign_in, container, false);
        ViewPager vp = (ViewPager) view.findViewById(R.id.viewpager);
        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        fragments.add(new SignUpFragement());
        fragments.add(new SignInFragement());
        final com.skeleton.adapter.PagerAdapter adapter = new com.skeleton.adapter.PagerAdapter(getChildFragmentManager(), fragments);
        vp.setAdapter(adapter);
        tabLayout.setupWithViewPager(vp);

        return view;
    }


}
