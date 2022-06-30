package com.pelsinkaplan.recyclerviewsampleproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pelsinkaplan.recyclerviewsampleproject.databinding.ItemPokemonBinding

/**
 * Created by Pelşin KAPLAN on 27.06.2022.
 */
class PokemonAdapter(var pokemons: List<PokemonInfoModel>) :
    RecyclerView.Adapter<PokemonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemPokemonBinding.inflate(inflater, parent, false)
        return PokemonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val pokemon = pokemons[position]
        holder.binding.apply {
            pokemonNameTextView.text = pokemon.name
            Glide.with(this.root).load(pokemon.imageUrl)
                .into(pokemonImageImageView)
        }
    }

    override fun getItemCount(): Int {
        return pokemons.size
    }
}

class PokemonViewHolder(val binding: ItemPokemonBinding) :
    RecyclerView.ViewHolder(binding.root)
