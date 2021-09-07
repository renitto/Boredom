package com.febeight.boredpm.ui.home

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.febeight.boredpm.model.repo.BoredomRepository
import com.febeight.boredpm.model.response.BoredomResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeScreenViewModel(private val boredomRepository: BoredomRepository = BoredomRepository()) :
    ViewModel() {
    init {

        viewModelScope.launch(Dispatchers.IO) {
            val boredomthought = getBoredomThought()
            boredomState.value = boredomthought
        }
    }

    val boredomState: MutableState<BoredomResponse> = mutableStateOf(BoredomResponse(1.00,"","","",1,2.00,""))

    private suspend fun getBoredomThought(): BoredomResponse {
        return boredomRepository.getBoredomThought()
    }
}