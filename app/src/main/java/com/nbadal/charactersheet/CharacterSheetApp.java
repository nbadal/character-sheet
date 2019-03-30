package com.nbadal.charactersheet;

import android.app.Application;
import android.content.Context;

import com.nbadal.charactersheet.inject.component.AppComponent;
import com.nbadal.charactersheet.inject.component.DaggerAppComponent;
import com.nbadal.charactersheet.inject.module.AppModule;

import timber.log.Timber;

public class CharacterSheetApp extends Application {
    private AppComponent component;

    public static CharacterSheetApp get(Context context) {
        return (CharacterSheetApp) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        appComponent().inject(this);
    }

    public AppComponent appComponent() {
        if (component == null) {
            component = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .build();
        }

        return component;
    }
}
