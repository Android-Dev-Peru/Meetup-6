package com.androiddevpe.pokedexkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.androiddevpe.pokedexkotlin.adapter.PokedexKtAdapter
import com.androiddevpe.pokedexkotlin.model.Pokemon
import com.isil.myfirstapp.model.PokemonKt
import java.util.*

/**
 * https://kotlinlang.org/docs/reference/collections.html
 */
class PokedexKotlinActivity : AppCompatActivity() {


    lateinit var mAdapter:PokedexKtAdapter
    lateinit var pokemonList:List<PokemonKt>
    lateinit var mLayoutManager: RecyclerView.LayoutManager
    lateinit var mRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokedex_kotlin)
        ui()
        loadData()

    }

    private fun ui() {
        mRecyclerView = findViewById(R.id.my_recycler_view) as RecyclerView
        mLayoutManager = GridLayoutManager(this,3)
        mRecyclerView.layoutManager= mLayoutManager
    }

    private fun loadData(){
        val pokemonKt:PokemonKt= PokemonKt()
        pokemonKt.name= "Abra"

        val pokemonKt1:PokemonKt= PokemonKt()
        pokemonKt1.name= "Arcanine"

        var pokemonKt2:PokemonKt= PokemonKt()
        pokemonKt2.name= "Bulbasaur"

        val pokemonKt3:PokemonKt= PokemonKt()
        pokemonKt3.name= "Caterpie"

        val pokemonKt4:PokemonKt= PokemonKt()
        pokemonKt4.name= "Drowzee"

        val pokemon5 = PokemonKt()
        pokemon5.name = "Exeggcute"

        val pokemon6 = PokemonKt()
        pokemon6.name = "Golem"

        val pokemon7 = PokemonKt()
        pokemon7.name = "Lickitung"

        val pokemon8 = PokemonKt()
        pokemon8.name = "Magmar"

        val pokemon9 = PokemonKt()
        pokemon9.name = "Nidorino"

        pokemonList= listOf(pokemonKt,pokemonKt1,pokemonKt2,pokemonKt3,pokemonKt4,
                pokemon5,pokemon6,pokemon7,pokemon8,pokemon9)
        //TODO method add
        mAdapter= PokedexKtAdapter(pokemonList)

        mRecyclerView.setAdapter(mAdapter)
    }
}
