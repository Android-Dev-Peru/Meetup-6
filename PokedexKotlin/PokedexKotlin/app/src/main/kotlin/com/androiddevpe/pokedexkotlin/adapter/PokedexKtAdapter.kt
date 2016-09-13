package com.androiddevpe.pokedexkotlin.adapter

import android.content.Context
import android.content.res.AssetManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.androiddevpe.pokedexkotlin.R
import com.isil.myfirstapp.model.PokemonKt
import kotlinx.android.synthetic.main.row_pokemon.view.*
import java.io.IOException
import java.io.InputStream

/**
 * Created by eduardomedina on 12/09/16.
 * Unresolver reference : kotlinx  -> kotlin extensions
 * https://kotlinlang.org/docs/reference/exceptions.html
 */
class PokedexKtAdapter (val pokemonList:List<PokemonKt>,val context:Context): RecyclerView.Adapter<PokedexKtAdapter.ViewHolder>() {

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
        val photo:String= pokemonList[position].photo
        holder!!.tviName.text = name //To change body of created functions use File | Settings | File Templates.
        holder.iviPhoto.setImageBitmap(getBitmapFromAssets(photo))
    }

    override fun getItemCount(): Int {
        return pokemonList.size //To change body of created functions use File | Settings | File Templates.
    }

    public fun getBitmapFromAssets(fileName:String):Bitmap{
        val assetManager:AssetManager= context.assets
        var istr: InputStream? = null
        try{
            istr = assetManager.open(fileName)
        }catch (e:IOException){
            e.printStackTrace()
        }
        val bitmap:Bitmap = BitmapFactory.decodeStream(istr)
        return bitmap
    }

}