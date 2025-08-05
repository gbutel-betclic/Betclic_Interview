package com.betclic.interview.details.data.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PlayerDetailsDto(
    @param:Json(name = "id") val id: String,
    @param:Json(name = "name") val name: String,
    @param:Json(name = "image") val image: String,
    @param:Json(name = "club") val club: String,
    @param:Json(name = "position") val position: String,
    @param:Json(name = "birthdate") val birthdate: String,
)