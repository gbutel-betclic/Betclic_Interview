package com.betclic.interview.api

import com.betclic.interview.api.dto.Character
import com.betclic.interview.api.dto.CharacterDetails
import io.reactivex.Single
import retrofit2.Retrofit
import javax.inject.Inject

class ExerciseApiClient @Inject constructor(
    retrofit: Retrofit
) {

    private val exerciseService: ExerciseService = retrofit.create(ExerciseService::class.java)

    fun getCharacters(): Single<List<Character>> =
        exerciseService.getCharacters()

    fun getCharacter(id: String): Single<CharacterDetails> =
        exerciseService.getCharacter(id)
}