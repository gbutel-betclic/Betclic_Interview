package com.betclic.interview.api.dto

import com.squareup.moshi.Json

data class CharacterDetails(
    @field:Json(name = "slug") val id: String,
    @field:Json(name = "name") val name: String,
    @field:Json(name = "image") val img: String?,
    @field:Json(name = "house") val house: String?,
    @field:Json(name = "actor") val portrayed: String?,
    @field:Json(name = "appearances") val appearances: List<String>,
    @field:Json(name = "age") val age: CharacterDetailsAge?,
    @field:Json(name = "gender") val gender: String,
    @field:Json(name = "alive") val alive: Boolean,
)

data class CharacterDetailsAge(
    @field:Json(name = "age") val age: Int,
)