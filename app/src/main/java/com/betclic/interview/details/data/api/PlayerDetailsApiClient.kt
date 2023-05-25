package com.betclic.interview.details.data.api

import com.betclic.interview.details.data.api.dto.PlayerDetailsDtoMapper
import com.betclic.interview.details.domain.model.PlayerDetails
import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject

class PlayerDetailsApiClient @Inject constructor(
    retrofit: Retrofit,
    private val playerDetailsDtoMapper: PlayerDetailsDtoMapper,
) {

    private val service: PlayerDetailsService = retrofit.create(PlayerDetailsService::class.java)

    fun getPlayerDetails(id: String): Single<PlayerDetails> =
        service.getPlayer(id)
            .map(playerDetailsDtoMapper::map)

    suspend fun getSuspendPlayerDetails(id: String) =
        service.getSuspendPlayer(id)
            .let(playerDetailsDtoMapper::map)
}