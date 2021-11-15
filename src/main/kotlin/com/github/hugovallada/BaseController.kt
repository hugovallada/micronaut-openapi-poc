package com.github.hugovallada

import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Status
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses

interface BaseController {


    @ApiResponses(
        value = [
            ApiResponse(
                description = "Success", responseCode = "200",
                content = [Content(schema = Schema(implementation = PokemonResponse::class))]
            ),
            ApiResponse(
                description = "Not Found", responseCode = "404",
                content = [Content(schema = Schema(implementation = ErrorResponse::class))]
            ),
            ApiResponse(
                description = "Fail", responseCode = "500",
                content = [Content(schema = Schema(implementation = ErrorResponse::class))]
            )
        ]
    )
    @Post
    @Status(HttpStatus.OK)
    fun createPokemon(pokemonRequest: PokemonRequest): PokemonResponse

}