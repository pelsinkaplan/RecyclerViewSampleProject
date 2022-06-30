package com.pelsinkaplan.recyclerviewsampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.pelsinkaplan.recyclerviewsampleproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PokemonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val list = listOf<PokemonInfoModel>(

            PokemonInfoModel(
                "Balbasaur",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png"
            ),
            PokemonInfoModel(
                "Charmander",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png"
            ),
            PokemonInfoModel(
                "Squirtle",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png"
            ),
            PokemonInfoModel(
                "Pikachu",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/025.png"
            ),
            PokemonInfoModel(
                "Eevee",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/133.png"
            ),
            PokemonInfoModel(
                "Tangela",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/114.png"
            ),
            PokemonInfoModel(
                "Cubone",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/104.png"
            ),
            PokemonInfoModel(
                "Muk",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/089.png"
            ),
            PokemonInfoModel(
                "Ponyta",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/077.png"
            ),
            PokemonInfoModel(
                "Abra",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/063.png"
            ),
            PokemonInfoModel(
                "Poliwhirl",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/061.png"
            ),
            PokemonInfoModel(
                "Grimer",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/088.png"
            ),
            PokemonInfoModel(
                "Oddish",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/043.png"
            ),
            PokemonInfoModel(
                "Jigglypuff",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/039.png"
            )
        )

        val gridLayoutManager = GridLayoutManager(this, 2)
        binding.userRecyclerView.layoutManager = gridLayoutManager
        gridLayoutManager.orientation = GridLayoutManager.VERTICAL
        adapter = PokemonAdapter(list)
        binding.userRecyclerView.adapter = adapter

    }
}