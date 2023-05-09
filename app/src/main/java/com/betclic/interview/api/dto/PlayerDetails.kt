package com.betclic.interview.api.dto

import com.squareup.moshi.Json

data class PlayerDetails(
    @field:Json(name = "id") val id: String,
    @field:Json(name = "name") val name: String,
    @field:Json(name = "image") val img: String,
    @field:Json(name = "club") val club: String,
    @field:Json(name = "position") val position: String,
    @field:Json(name = "birthdate") val birthdate: String,
)