package com.betclic.interview.home.data.api.dto

import com.squareup.moshi.Json

data class PlayerDto(
    @Json(name = "id") val id: String,
    @Json(name = "name") val name: String,
    @Json(name = "image") val image: String,
    @Json(name = "club") val club: String,
    @Json(name = "position") val position: String,
)