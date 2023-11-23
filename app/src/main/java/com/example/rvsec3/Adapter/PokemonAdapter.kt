package com.example.rvsec3.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rvsec3.Models.Pokemon
import com.example.rvsec3.R

class PokemonAdapter(val listaPokemon: List<Pokemon>):
    RecyclerView.Adapter<PokemonAdapter.ViewHolder>()
{
    //Paso 1
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        //Buscar definir una variable para cada elemento en la vista
        val tvNombre: TextView
        val tvNumero: TextView
        val tvCategoria: TextView
        val tvHabilidad: TextView
        val IvPokemon: ImageView

        init {
            tvNombre = itemView.findViewById(R.id.tvNombre)
            tvNumero = itemView.findViewById(R.id.tvNumero)
            tvCategoria = itemView.findViewById(R.id.tvCategoria)
            tvHabilidad = itemView.findViewById(R.id.tvHabilidad)
            IvPokemon = itemView.findViewById(R.id.ivPokemon)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rv_pokemon, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaPokemon.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pokemon = listaPokemon[position]

        holder.tvNombre.text = pokemon.Nombre
        holder.tvNumero.text = pokemon.Numero
        holder.tvHabilidad.text = pokemon.Habilidad
        holder.tvCategoria.text = pokemon.Categoria
        pokemon.Imagen?.let { holder.IvPokemon.setImageResource(it) }

    }


}