package com.omaemirates.viewmodel

import androidx.lifecycle.ViewModel
import com.omaemirates.repository.DataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: DataRepository) : ViewModel() {

    fun getApiData() {
        val data = repository.getTextJSON()
    }
}
