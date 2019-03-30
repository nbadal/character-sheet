package com.nbadal.charactersheet.service;

import com.nbadal.charactersheet.model.Character;

import io.reactivex.Observable;

public class CharactersService {

    public Observable<Character> getAllCharacters() {
        return Observable.range(1, 100)
                .map(i -> new Character("Character " + i));
    }

}
