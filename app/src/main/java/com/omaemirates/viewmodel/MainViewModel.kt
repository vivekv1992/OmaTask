package com.omaemirates.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omaemirates.common.ApiResponse
import com.omaemirates.model.DataModel
import com.omaemirates.repository.DataRepository
import com.omaemirates.state.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: DataRepository) : ViewModel() {
    private val _uiState = MutableStateFlow<UiState<DataModel>>(UiState.Loading)
    val uiState: StateFlow<UiState<DataModel>> = _uiState
    fun getApiData() {
        viewModelScope.launch {
            when (val response = repository.getApiData()) {
                is ApiResponse.Success -> {
                    _uiState.value = UiState.Success(response.data)
                }
                is ApiResponse.Failure -> {
                    _uiState.value = UiState.Error(response.error)
                }
            }
        }
    }
}
