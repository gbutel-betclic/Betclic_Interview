package com.betclic.interview.home.data.api

import com.betclic.interview.home.data.api.dto.PlayerDto
import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject

class PlayersApiClient @Inject constructor(
    retrofit: Retrofit,
) {

    private val service: PlayersService = retrofit.create(PlayersService::class.java)

    fun getPlayers(): Single<List<PlayerDto>> =
        service.getPlayers()

    suspend fun getSuspendPlayers(): List<PlayerDto> =
        service.getSuspendPlayers()
}