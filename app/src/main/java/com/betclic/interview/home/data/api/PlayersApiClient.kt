package com.betclic.interview.home.data.api

import com.betclic.interview.home.data.api.dto.PlayerDtoMapper
import com.betclic.interview.home.domain.model.Player
import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject

class PlayersApiClient @Inject constructor(
    retrofit: Retrofit,
    private val playerDtoMapper: PlayerDtoMapper,
) {

    private val service: PlayersService = retrofit.create(PlayersService::class.java)

    fun getPlayers(): Single<List<Player>> =
        service.getPlayers()
            .map(playerDtoMapper::map)

    suspend fun getSuspendPlayers(): List<Player> =
        service.getSuspendPlayers()
            .let(playerDtoMapper::map)
}