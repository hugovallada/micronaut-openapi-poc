package com.github.hugovallada

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller

@Controller("/pokemons", produces = [MediaType.APPLICATION_JSON])
class PokemonController(private val translator: Translators) : BaseController {

    override fun createPokemon(pokemonRequest: PokemonRequest): PokemonResponse {
        return translator translate pokemonRequest
    }

}