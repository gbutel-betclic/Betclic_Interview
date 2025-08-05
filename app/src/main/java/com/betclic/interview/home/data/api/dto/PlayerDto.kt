package com.betclic.interview.home.data.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PlayerDto(
    @param:Json(name = "id") val id: String,
    @param:Json(name = "name") val name: String,
    @param:Json(name = "image") val image: String,
    @param:Json(name = "club") val club: String,
    @param:Json(name = "position") val position: String,
)