package com.nbadal.charactersheet.ui.list;

import android.os.Bundle;

import com.nbadal.charactersheet.R;
import com.nbadal.charactersheet.model.Character;
import com.nbadal.charactersheet.ui.base.BaseActivity;

import java.util.List;

import javax.inject.Inject;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ListActivity extends BaseActivity implements ListView {

    @Inject
    ListPresenter presenter;

    @BindView(R.id.list)
    RecyclerView list;

    private CharacterAdapter characterAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent().inject(this);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        list.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        characterAdapter = new CharacterAdapter();
        list.setAdapter(characterAdapter);
        list.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.attach(this);
    }

    @Override
    public void showCharacters(List<Character> characters) {
        characterAdapter.setChracters(characters);
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.detach();
    }
}
