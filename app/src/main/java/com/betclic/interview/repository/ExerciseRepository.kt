package com.betclic.interview.repository

import com.betclic.interview.api.ExerciseApiClient
import com.betclic.interview.api.dto.PlayerDetails
import com.betclic.interview.api.dto.Player
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ExerciseRepository @Inject constructor(
    private val exerciseApiClient: ExerciseApiClient
) {

    fun getPlayers(): Single<List<Player>> =
        exerciseApiClient.getPlayers()

    fun getPlayer(id: String): Single<PlayerDetails> =
        exerciseApiClient.getPlayer(id)

    suspend fun getSuspendPlayer(id: String): PlayerDetails =
        exerciseApiClient.getSuspendPlayer(id)
}