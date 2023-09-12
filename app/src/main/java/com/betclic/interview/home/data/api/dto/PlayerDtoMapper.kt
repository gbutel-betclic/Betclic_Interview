package com.betclic.interview.home.data.api.dto

import com.betclic.interview.home.domain.model.Player
import javax.inject.Inject

class PlayerDtoMapper @Inject constructor() {

    fun map(playerDtoList: List<PlayerDto>): List<Player> =
        playerDtoList.map(::map)

    private fun map(playerDto: PlayerDto): Player =
        Player(
            id = playerDto.id,
            name = playerDto.name,
            photo = playerDto.image,
            position = playerDto.position,
            club = playerDto.club,
        )
}