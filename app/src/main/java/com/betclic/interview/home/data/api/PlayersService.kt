package com.betclic.interview.home.data.api

import com.betclic.interview.home.data.api.dto.PlayerDto
import io.reactivex.Single
import retrofit2.http.GET

interface PlayersService {

    @GET("players")
    fun getPlayers(): Single<List<PlayerDto>>

    @GET("players")
    suspend fun getSuspendPlayers(): List<PlayerDto>
}