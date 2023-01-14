package com.betclic.interview.api

import com.betclic.interview.api.dto.Character
import com.betclic.interview.api.dto.CharacterDetails
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface ExerciseService {

    @GET("characters")
    fun getCharacters(): Single<List<Character>>

    @GET("characters/bySlug/{id}")
    fun getCharacter(@Path("id") id: String): Single<CharacterDetails>

    @GET("characters/bySlug/{id}")
    suspend fun getSuspendCharacter(@Path("id") id: String): CharacterDetails
}