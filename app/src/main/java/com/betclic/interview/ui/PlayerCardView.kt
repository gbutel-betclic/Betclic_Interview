package com.betclic.interview.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.cardview.widget.CardView
import com.betclic.interview.databinding.ViewPlayerCardBinding
import com.betclic.interview.extension.topCrop
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

class PlayerCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {

    private val binding = ViewPlayerCardBinding.inflate(LayoutInflater.from(context), this)

    fun set(state: PlayerCardState) {
        Glide.with(this)
            .load(state.imageUrl)
            .topCrop()
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(binding.playerAvatar)
        binding.playerName.text = state.name
        binding.playerClub.text = state.club
        binding.playerPosition.text = state.position
    }
}

data class PlayerCardState(
    val imageUrl: String,
    val name: String,
    val club: String,
    val position: String,
)