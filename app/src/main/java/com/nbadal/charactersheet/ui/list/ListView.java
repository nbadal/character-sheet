package com.nbadal.charactersheet.ui.list;


import com.nbadal.charactersheet.model.Character;
import com.nbadal.charactersheet.ui.base.BaseView;

import java.util.List;

public interface ListView extends BaseView {
    void showCharacters(List<Character> characters);
}
