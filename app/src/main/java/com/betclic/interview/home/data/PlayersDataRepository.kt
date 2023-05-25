package com.betclic.interview.home.data

import com.betclic.interview.home.data.api.PlayersApiClient
import com.betclic.interview.home.domain.model.Player
import com.betclic.interview.home.domain.PlayersRepository
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PlayersDataRepository @Inject constructor(
    private val playersApiClient: PlayersApiClient,
) : PlayersRepository {

    override fun getPlayers(): Single<List<Player>> =
        playersApiClient.getPlayers()

    override suspend fun getSuspendPlayers(): List<Player> =
        playersApiClient.getSuspendPlayers()
}