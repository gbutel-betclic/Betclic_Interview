package com.betclic.interview.home.domain

import com.betclic.interview.home.domain.model.Player
import io.reactivex.Single

interface PlayersRepository {

    fun getPlayers(): Single<List<Player>>

    // OR if we want to use coroutines instead of Rx
    suspend fun getSuspendPlayers(): List<Player>
}