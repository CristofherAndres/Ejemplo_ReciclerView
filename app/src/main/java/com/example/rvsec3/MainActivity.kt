package com.example.rvsec3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rvsec3.Adapter.PokemonAdapter
import com.example.rvsec3.Models.Pokemon

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listPokemon = ArrayList<Pokemon>()

        listPokemon.add(Pokemon("Bulbasaur","N.º 0001", "Semilla","Espesura",R.drawable.p1))
        listPokemon.add(Pokemon("Ivysaur","N.º 0002", "Semilla","Espesura",R.drawable.p2))
        listPokemon.add(Pokemon("Venusaur","N.º 0003", "Semilla","Espesura",R.drawable.p3))
        listPokemon.add(Pokemon("Charmander","N.º 0004", "Lagartija","Mar Llamas",R.drawable.p4))
        listPokemon.add(Pokemon("Charmeleon","N.º 0005", "Llama","Mar Llamas",R.drawable.p5))
        listPokemon.add(Pokemon("Charizard","N.º 0006", "Llama","Mar Llamas",R.drawable.p6))
        listPokemon.add(Pokemon("Squirtle","N.º 0007", "Tortuguita","Torrente",R.drawable.p7))
        listPokemon.add(Pokemon("Wartortle","N.º 0008", "Tortuga","Torrente",R.drawable.p8))
        listPokemon.add(Pokemon("Blastoise","N.º 0009", "Armazón","Torrente",R.drawable.p9))


        //Buscar nuestro recyclerview en la pantalla
        val rvPokemon = findViewById<RecyclerView>(R.id.rvPokemon)
        rvPokemon.layoutManager = LinearLayoutManager(this)

        val adaptadorPokemon = PokemonAdapter(listPokemon)
        rvPokemon.adapter = adaptadorPokemon

    }
}