package com.nbadal.charactersheet.inject.component;

import com.nbadal.charactersheet.CharacterSheetApp;
import com.nbadal.charactersheet.inject.module.AppModule;
import com.nbadal.charactersheet.service.CharactersService;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(CharacterSheetApp app);

    CharacterSheetApp app();

    CharactersService characters();
}
