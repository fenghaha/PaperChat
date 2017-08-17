package com.zia.magiccard.View;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;

import com.roughike.bottombar.BottomBar;
import com.zia.magiccard.Base.BaseActivity;
import com.zia.magiccard.Presenter.MainPresenter;
import com.zia.magiccard.Presenter.MainPresenterImp;
import com.zia.magiccard.R;
import com.zia.magiccard.Transitions.SlideUpTransition;
import com.zia.magiccard.View.Fragments.MessageFragment;

public class MainActivity extends BaseActivity implements MainActivityImp {

    private BottomBar bottomBar;
    private ViewPager viewPager;
    private MainPresenterImp presenterImp;

    @Override
    protected void onCreated() {
        presenterImp.setViewPager();
    }

    @Override
    protected void findWidgets() {
        presenterImp = new MainPresenter(this);
        bottomBar = $(R.id.main_bottomBar);
        viewPager = $(R.id.main_viewPager);
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void beforeSetContentView() {

    }

    @Override
    public BottomBar getBottomBar() {
        return bottomBar;
    }

    @Override
    public ViewPager getViewPager() {
        return viewPager;
    }

    @Override
    public FragmentManager getFragmentsManager() {
        return getSupportFragmentManager();
    }
}
