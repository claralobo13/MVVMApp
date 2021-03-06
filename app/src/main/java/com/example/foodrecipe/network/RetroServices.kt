package com.example.foodrecipe.network

import com.example.foodrecipe.model.RecyclerList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

// Use @GET annotation to define  end points, define function getRecipes which returns response
// in RecyclerList, using coroutine so mark that function as suspend function.


interface RetroServices {
    @GET("recipes/complexSearch")

    suspend fun getRecipes(
        @Query("apiKey") api_key: String?,
        @Query("number") number: Int
    ): RecyclerList



}