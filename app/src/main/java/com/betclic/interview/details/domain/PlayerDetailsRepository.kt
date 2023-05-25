package com.betclic.interview.details.domain

import com.betclic.interview.details.domain.model.PlayerDetails
import io.reactivex.Single

interface PlayerDetailsRepository {

    fun getPlayerDetails(playerId: String): Single<PlayerDetails>

    // OR if we want to use coroutines instead of Rx
    suspend fun getSuspendPlayerDetails(playerId: String): PlayerDetails
}