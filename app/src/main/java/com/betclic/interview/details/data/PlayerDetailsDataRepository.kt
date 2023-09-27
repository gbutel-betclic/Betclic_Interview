package com.betclic.interview.details.data

import com.betclic.interview.details.data.api.PlayerDetailsApiClient
import com.betclic.interview.details.data.api.dto.PlayerDetailsDtoMapper
import com.betclic.interview.details.domain.PlayerDetailsRepository
import com.betclic.interview.details.domain.model.PlayerDetails
import io.reactivex.Single
import javax.inject.Inject

class PlayerDetailsDataRepository @Inject constructor(
    private val playerDetailsApiClient: PlayerDetailsApiClient,
    private val playerDetailsDtoMapper: PlayerDetailsDtoMapper,
) : PlayerDetailsRepository {

    override fun getPlayerDetails(playerId: String): Single<PlayerDetails> =
        playerDetailsApiClient.getPlayerDetails(playerId)
            .map(playerDetailsDtoMapper::map)

    override suspend fun getSuspendPlayerDetails(playerId: String): PlayerDetails =
        playerDetailsApiClient.getSuspendPlayerDetails(playerId)
            .let(playerDetailsDtoMapper::map)
}