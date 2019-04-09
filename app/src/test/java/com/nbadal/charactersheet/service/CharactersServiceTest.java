package com.nbadal.charactersheet.service;

import org.junit.Before;
import org.junit.Test;

public class CharactersServiceTest {

    private CharactersService characters;

    @Before
    public void setUp() {
        characters = new CharactersService();
    }

    @Test
    public void shouldReturnCharacters() {
        characters.getAllCharacters()
                .count().test()
                .assertValue(count -> count > 0);
    }
}