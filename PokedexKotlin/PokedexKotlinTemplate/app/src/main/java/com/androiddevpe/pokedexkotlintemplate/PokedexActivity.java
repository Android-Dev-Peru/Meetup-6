package com.androiddevpe.pokedexkotlintemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.androiddevpe.pokedexkotlintemplate.adapter.PokedexAdapter;
import com.androiddevpe.pokedexkotlintemplate.model.Pokemon;

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
        pokemon.setPhoto("images/Abra.png");

        Pokemon pokemon1= new Pokemon();
        pokemon1.setName("Arcanine");
        pokemon1.setPhoto("images/Arcanine.png");

        Pokemon pokemon2= new Pokemon();
        pokemon2.setName("Bulbasaur");
        pokemon2.setPhoto("images/Bulbasaur.png");

        Pokemon pokemon3= new Pokemon();
        pokemon3.setName("Caterpie");
        pokemon3.setPhoto("images/Caterpie.png");

        Pokemon pokemon4= new Pokemon();
        pokemon4.setName("Drowzee");
        pokemon4.setPhoto("images/Drowzee.png");

        Pokemon pokemon5= new Pokemon();
        pokemon5.setName("Exeggcute");
        pokemon5.setPhoto("images/Exeggcute.png");

        Pokemon pokemon6= new Pokemon();
        pokemon6.setName("Golem");
        pokemon6.setPhoto("images/Golem.png");

        Pokemon pokemon7= new Pokemon();
        pokemon7.setName("Lickitung");
        pokemon7.setPhoto("images/Lickitung.png");

        Pokemon pokemon8= new Pokemon();
        pokemon8.setName("Magmar");
        pokemon8.setPhoto("images/Magmar.png");

        Pokemon pokemon9= new Pokemon();
        pokemon9.setName("Nidorino");
        pokemon9.setPhoto("images/Nidorino.png");

        Pokemon pokemon10= new Pokemon();
        pokemon10.setName("Pikachu");
        pokemon10.setPhoto("images/Pikachu.png");

        Pokemon pokemon11= new Pokemon();
        pokemon11.setName("Ponyta");
        pokemon11.setPhoto("images/Ponyta.png");

        Pokemon pokemon12= new Pokemon();
        pokemon12.setName("Psyduck");
        pokemon12.setPhoto("images/Psyduck.png");

        Pokemon pokemon13= new Pokemon();
        pokemon13.setName("Vaporeon");
        pokemon13.setPhoto("images/Vaporeon.png");

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
        pokemonList.add(pokemon10);
        pokemonList.add(pokemon11);
        pokemonList.add(pokemon12);

        // specify an adapter (see also next example)
        mAdapter = new PokedexAdapter(this,pokemonList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
