package com.androiddevpe.pokedexkotlin.adapter;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.androiddevpe.pokedexkotlin.R;
import com.androiddevpe.pokedexkotlin.model.Pokemon;

import java.util.List;

/**
 * Created by Profesor on 07/09/2016.
 */
public class PokedexAdapter extends RecyclerView.Adapter<PokedexAdapter.ViewHolder> {
    private List<Pokemon> pokemonList;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView tviName;
        public ImageView iviPhoto;
        public View view;
        public ViewHolder(View  v) {
            super(v);
            this.view = v;
            tviName= (TextView) v.findViewById(R.id.tviName);
            iviPhoto= (ImageView) v.findViewById(R.id.iviPhoto);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public PokedexAdapter(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_pokemon, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Pokemon pokemon= pokemonList.get(position);
        holder.tviName.setText(pokemon.getName());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return pokemonList.size();
    }
}
