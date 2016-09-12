package com.androiddevpe.pokedexkotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.androiddevpe.pokedexkotlin.R
import com.isil.myfirstapp.model.PokemonKt
import kotlinx.android.synthetic.main.row_pokemon.view.*

/**
 * Created by eduardomedina on 12/09/16.
 * Unresolver reference : kotlinx  -> kotlin extensions
 */
class PokedexKtAdapter (val pokemonList:List<PokemonKt>): RecyclerView.Adapter<PokedexKtAdapter.ViewHolder>() {

    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        val tviName:TextView = view.tviName
        val iviPhoto:ImageView = view.iviPhoto
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.row_pokemon, parent, false)) //To change body of created functions use File | Settings | File Templates.
    }

    /*
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        val name:String = pokemonList[position].name
        holder!!.tviName.text = name //To change body of created functions use File | Settings | File Templates.
    }*/

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        val name:String = pokemonList[position].name
        holder!!.tviName.text = name //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return pokemonList.size //To change body of created functions use File | Settings | File Templates.
    }

}