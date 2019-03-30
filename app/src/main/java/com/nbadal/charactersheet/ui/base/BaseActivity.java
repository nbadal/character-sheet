package com.nbadal.charactersheet.ui.base;


import com.nbadal.charactersheet.CharacterSheetApp;
import com.nbadal.charactersheet.inject.component.ActivityComponent;
import com.nbadal.charactersheet.inject.component.AppComponent;
import com.nbadal.charactersheet.inject.component.DaggerActivityComponent;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    private ActivityComponent activityComponent;

    protected ActivityComponent activityComponent() {
        if (activityComponent == null) {
            activityComponent = DaggerActivityComponent.builder()
                    .appComponent(appComponent())
                    .build();
        }
        return activityComponent;
    }

    protected AppComponent appComponent() {
        return CharacterSheetApp.get(this).appComponent();
    }

}
