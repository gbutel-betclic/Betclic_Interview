package com.betclic.interview.api

import com.betclic.interview.api.dto.Player
import com.betclic.interview.api.dto.PlayerDetails
import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject

class ExerciseApiClient @Inject constructor(
    retrofit: Retrofit
) {

    private val exerciseService: ExerciseService = retrofit.create(ExerciseService::class.java)

    fun getPlayers(): Single<List<Player>> =
        exerciseService.getPlayers()

    fun getPlayer(id: String): Single<PlayerDetails> =
        exerciseService.getPlayer(id)

    suspend fun getSuspendPlayer(id: String) =
        exerciseService.getSuspendPlayer(id)
}