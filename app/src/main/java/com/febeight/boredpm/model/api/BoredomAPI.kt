package com.febeight.boredpm.model.api

import com.febeight.boredpm.model.response.BoredomResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class BoredomAPI {
    private lateinit var api: BoredomAPI

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.boredapi.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(BoredomAPI::class.java)
    }

    suspend fun getBoredomThought(): BoredomResponse {
        return api.getBoredomThought()
    }

    interface BoredomAPI {
        @GET("activity")
        suspend fun getBoredomThought(): BoredomResponse
    }
}