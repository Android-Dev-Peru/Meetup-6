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
        pokemonKt.photo= "images/Abra.png"

        val pokemonKt1:PokemonKt= PokemonKt()
        pokemonKt1.name= "Arcanine"
        pokemonKt1.photo= "images/Arcanine.png"

        var pokemonKt2:PokemonKt= PokemonKt()
        pokemonKt2.name= "Bulbasaur"
        pokemonKt2.photo= "images/Bulbasaur.png"

        val pokemonKt3:PokemonKt= PokemonKt()
        pokemonKt3.name= "Caterpie"
        pokemonKt3.photo= "images/Caterpie.png"

        val pokemonKt4:PokemonKt= PokemonKt()
        pokemonKt4.name= "Drowzee"
        pokemonKt4.photo= "images/Drowzee.png"

        val pokemon5 = PokemonKt()
        pokemon5.name = "Exeggcute"
        pokemon5.photo= "images/Exeggcute.png"

        val pokemon6 = PokemonKt()
        pokemon6.name = "Golem"
        pokemon6.photo= "images/Golem.png"

        val pokemon7 = PokemonKt()
        pokemon7.name = "Lickitung"
        pokemon7.photo= "images/Lickitung.png"

        val pokemon8 = PokemonKt()
        pokemon8.name = "Magmar"
        pokemon8.photo= "images/Magmar.png"

        val pokemon9 = PokemonKt()
        pokemon9.name = "Nidorino"
        pokemon9.photo= "images/Nidorino.png"

        val pokemon10 = PokemonKt()
        pokemon10.name = "Pikachu"
        pokemon10.photo= "images/Pikachu.png"

        val pokemon11 = PokemonKt()
        pokemon11.name = "Ponyta"
        pokemon11.photo= "images/Ponyta.png"

        val pokemon12 = PokemonKt()
        pokemon12.name = "Psyduck"
        pokemon12.photo= "images/Psyduck.png"

        val pokemon13 = PokemonKt()
        pokemon13.name = "Vaporeon"
        pokemon13.photo = "images/Vaporeon.png"

        pokemonList= listOf(pokemonKt,pokemonKt1,pokemonKt2,pokemonKt3,pokemonKt4,
                pokemon5,pokemon6,pokemon7,pokemon8,pokemon9,
                pokemon10, pokemon11,pokemon12,pokemon13)
        //TODO method add
        mAdapter= PokedexKtAdapter(pokemonList,this)

        mRecyclerView.setAdapter(mAdapter)
    }
}
