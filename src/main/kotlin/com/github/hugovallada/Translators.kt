package com.github.hugovallada

import jakarta.inject.Singleton

@Singleton
class Translators {

    infix fun translate(pokemonRequest: PokemonRequest): PokemonResponse = PokemonResponse(pokemonRequest.name)

}