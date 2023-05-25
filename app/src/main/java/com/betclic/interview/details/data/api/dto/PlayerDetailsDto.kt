package com.betclic.interview.details.data.api.dto

import com.squareup.moshi.Json

data class PlayerDetailsDto(
    @Json(name = "id") val id: String,
    @Json(name = "name") val name: String,
    @Json(name = "image") val image: String,
    @Json(name = "club") val club: String,
    @Json(name = "position") val position: String,
    @Json(name = "birthdate") val birthdate: String,
)