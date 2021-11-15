package com.github.hugovallada

import io.micronaut.http.HttpStatus
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Error
import io.micronaut.http.annotation.Status

@Controller("/pokemons", produces = [MediaType.APPLICATION_JSON])
class PokemonController(private val translator: Translators) : BaseController {

    override fun createPokemon(pokemonRequest: PokemonRequest): PokemonResponse {
        return translator translate pokemonRequest
    }


    @Error(exception = Exception::class)
    @Status(HttpStatus.FORBIDDEN)
    fun localError(ex: Exception): ErrorResponse {
        return ErrorResponse(ex.message ?: "Error", "403")
    }

}