package com.betclic.interview.details.data.api

import com.betclic.interview.details.data.api.dto.PlayerDetailsDto
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface PlayerDetailsService {

    @GET("players/{id}")
    fun getPlayer(@Path("id") id: String): Single<PlayerDetailsDto>

    @GET("players/{id}")
    suspend fun getSuspendPlayer(@Path("id") id: String): PlayerDetailsDto
}