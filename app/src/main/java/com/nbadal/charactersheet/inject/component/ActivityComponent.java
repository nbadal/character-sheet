package com.nbadal.charactersheet.inject.component;

import com.nbadal.charactersheet.inject.ActivityScope;
import com.nbadal.charactersheet.inject.module.ActivityModule;
import com.nbadal.charactersheet.ui.list.ListActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(ListActivity list);
}
