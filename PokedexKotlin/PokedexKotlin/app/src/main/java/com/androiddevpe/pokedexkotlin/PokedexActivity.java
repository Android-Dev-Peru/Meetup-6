package com.androiddevpe.pokedexkotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.androiddevpe.pokedexkotlin.adapter.PokedexAdapter;
import com.androiddevpe.pokedexkotlin.model.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class PokedexActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Pokemon> pokemonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedex);
        ui();
        loadData();
    }

    private void ui() {

        mRecyclerView= (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        // use a linear layout manager
        mLayoutManager = new GridLayoutManager(this,3);
        mRecyclerView.setLayoutManager(mLayoutManager);
    }


    private void loadData() {
        Pokemon pokemon= new Pokemon();
        pokemon.setName("Abra");

        Pokemon pokemon1= new Pokemon();
        pokemon1.setName("Arcanine");

        Pokemon pokemon2= new Pokemon();
        pokemon2.setName("Bulbasaur");

        Pokemon pokemon3= new Pokemon();
        pokemon3.setName("Caterpie");

        Pokemon pokemon4= new Pokemon();
        pokemon4.setName("Drowzee");

        Pokemon pokemon5= new Pokemon();
        pokemon5.setName("Exeggcute");

        Pokemon pokemon6= new Pokemon();
        pokemon6.setName("Golem");

        Pokemon pokemon7= new Pokemon();
        pokemon7.setName("Lickitung");

        Pokemon pokemon8= new Pokemon();
        pokemon8.setName("Magmar");

        Pokemon pokemon9= new Pokemon();
        pokemon9.setName("Nidorino");

        pokemonList= new ArrayList<>();
        pokemonList.add(pokemon);
        pokemonList.add(pokemon1);
        pokemonList.add(pokemon2);
        pokemonList.add(pokemon3);
        pokemonList.add(pokemon4);
        pokemonList.add(pokemon5);
        pokemonList.add(pokemon6);
        pokemonList.add(pokemon7);
        pokemonList.add(pokemon8);
        pokemonList.add(pokemon9);

        // specify an adapter (see also next example)
        mAdapter = new PokedexAdapter(pokemonList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
