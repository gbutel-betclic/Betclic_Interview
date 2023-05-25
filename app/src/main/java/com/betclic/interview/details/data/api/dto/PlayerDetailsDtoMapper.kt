package com.betclic.interview.details.data.api.dto

import com.betclic.interview.details.domain.model.PlayerDetails
import javax.inject.Inject

class PlayerDetailsDtoMapper @Inject constructor() {

    fun map(detailsDto: PlayerDetailsDto): PlayerDetails =
        PlayerDetails(
            id = detailsDto.id,
            name = detailsDto.name,
            photo = detailsDto.image,
            club = detailsDto.club,
            position = detailsDto.position,
            birthdate = detailsDto.birthdate,
        )
}