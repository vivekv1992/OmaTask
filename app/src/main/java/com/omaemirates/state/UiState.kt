package com.omaemirates.state

sealed class UiState<out T> {
    object Initial : UiState<Nothing>()
    object Loading : UiState<Nothing>()
    object Finish : UiState<Nothing>()
    class Success<out T>(val data: T) : UiState<T>()
    class Error(val exception: Throwable) : UiState<Nothing>()
}