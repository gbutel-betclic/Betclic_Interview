package com.betclic.interview.details.data.api

import com.betclic.interview.details.data.api.dto.PlayerDetailsDto
import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject

class PlayerDetailsApiClient @Inject constructor(
    retrofit: Retrofit,
) {

    private val service: PlayerDetailsService = retrofit.create(PlayerDetailsService::class.java)

    fun getPlayerDetails(id: String): Single<PlayerDetailsDto> =
        service.getPlayer(id)

    suspend fun getSuspendPlayerDetails(id: String): PlayerDetailsDto =
        service.getSuspendPlayer(id)
}