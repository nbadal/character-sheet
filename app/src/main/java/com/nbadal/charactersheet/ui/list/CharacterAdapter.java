package com.nbadal.charactersheet.ui.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nbadal.charactersheet.R;
import com.nbadal.charactersheet.model.Character;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.ViewHolder> {

    private final List<Character> characters = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_character, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(characters.get(position));
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    public void setChracters(List<Character> chracters) {
        this.characters.clear();
        this.characters.addAll(chracters);

        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.name)
        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bind(Character character) {
            name.setText(character.name);
        }
    }
}
