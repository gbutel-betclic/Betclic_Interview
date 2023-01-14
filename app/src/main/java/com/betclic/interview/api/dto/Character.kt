package com.betclic.interview.api.dto

import com.squareup.moshi.Json

data class Character(
    @field:Json(name = "slug") val id: String,
    @field:Json(name = "name") val name: String,
    @field:Json(name = "image") val img: String?,
    @field:Json(name = "house") val house: String?,
    @field:Json(name = "actor") val portrayed: String?,
)