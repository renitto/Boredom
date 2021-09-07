package com.febeight.boredpm.model.repo

import com.febeight.boredpm.model.api.BoredomAPI
import com.febeight.boredpm.model.response.BoredomResponse

class BoredomRepository(private val boredomAPI: BoredomAPI = BoredomAPI()) {
    suspend fun getBoredomThought(): BoredomResponse {
        return boredomAPI.getBoredomThought()
    }
}