package com.nbadal.charactersheet.inject.module;

import com.nbadal.charactersheet.CharacterSheetApp;
import com.nbadal.charactersheet.service.CharactersService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final CharacterSheetApp app;

    public AppModule(CharacterSheetApp app) {
        this.app = app;
    }

    @Provides
    CharacterSheetApp app() {
        return app;
    }

    @Provides
    @Singleton
    CharactersService charaters() {
        return new CharactersService();
    }
}
