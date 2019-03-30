package com.nbadal.charactersheet.ui.list;


import com.nbadal.charactersheet.service.CharactersService;
import com.nbadal.charactersheet.ui.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class ListPresenter extends BasePresenter<ListView> {


    private CharactersService characters;
    private CompositeDisposable disposables = new CompositeDisposable();

    @Inject
    public ListPresenter(CharactersService characters) {
        this.characters = characters;
    }

    @Override
    public void attach(ListView view) {
        super.attach(view);

        disposables.add(characters.getAllCharacters()
                .toList()
                .subscribe(view::showCharacters));
    }


    @Override
    public void detach() {
        super.detach();

        disposables.dispose();
    }

}
