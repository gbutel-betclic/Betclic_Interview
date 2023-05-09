package com.betclic.interview.api

import com.betclic.interview.api.dto.Player
import com.betclic.interview.api.dto.PlayerDetails
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface ExerciseService {

    @GET("players")
    fun getPlayers(): Single<List<Player>>

    @GET("players/{id}")
    fun getPlayer(@Path("id") id: String): Single<PlayerDetails>

    @GET("players/{id}")
    suspend fun getSuspendPlayer(@Path("id") id: String): PlayerDetails
}