package com.betclic.interview.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.betclic.interview.R
import com.betclic.interview.api.dto.Player

class MainAdapter : RecyclerView.Adapter<MainAdapter.PlayerViewHolder>() {

    var players: List<Player> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        return PlayerViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_player, parent, false) as PlayerCardView
        )
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val player = players[position]
        holder.item.set(
            PlayerCardState(
                imageUrl = player.img,
                name = player.name,
                club = player.club,
                position = player.position,
            )
        )
    }

    override fun getItemCount(): Int = players.size

    class PlayerViewHolder(
        val item: PlayerCardView
    ) : RecyclerView.ViewHolder(item)
}