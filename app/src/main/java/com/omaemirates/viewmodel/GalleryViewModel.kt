package com.omaemirates.viewmodel

import android.util.JsonReader
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omaemirates.repository.DataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: DataRepository) : ViewModel() {

    fun searchPictures(queryString: String) {
        repository.getTextJSON()
/*
        applicationContext.assets.open("task.text").use { inputStream ->
            JsonReader(inputStream.reader()).use { jsonReader ->
                val plantType = object : TypeToken<List<Plant>>() {}.type
                val plantList: List<Plant> = Gson().fromJson(jsonReader, plantType)
                val database = AppDatabase.getInstance(applicationContext)
                database.plantDao().insertAll(plantList)
                Result.success()
            }
        }*/

        /*currentQueryValue = queryString
        val newResult: Flow<PagingData<UnsplashPhoto>> =
            repository.getSearchResultStream(queryString).cachedIn(viewModelScope)
        currentSearchResult = newResult*/

    }
}
