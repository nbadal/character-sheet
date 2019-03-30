package com.nbadal.charactersheet.inject.module;


import com.nbadal.charactersheet.ui.base.BaseActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private final BaseActivity activity;

    public ActivityModule(BaseActivity activity) {
        this.activity = activity;
    }

    @Provides
    BaseActivity activity() {
        return activity;
    }
}
