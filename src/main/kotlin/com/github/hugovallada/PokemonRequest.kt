package com.github.hugovallada

import io.swagger.v3.oas.annotations.media.Schema

typealias Power = Map<String, String>

@Schema(name = "Pokemon DTO", description = "Request POKEMON")
data class PokemonRequest(
    @get:Schema(required = true, maxLength = 20, description = "The type of the pokemon")
    val type: String,
    @get:Schema(required = true, maxLength = 30, description = "The name of the pokemon")
    val name: String,
    @Schema
    val powers: Power
)
