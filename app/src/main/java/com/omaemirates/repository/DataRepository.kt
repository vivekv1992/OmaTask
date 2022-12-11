package com.omaemirates.repository

import android.app.Application
import com.google.gson.Gson
import com.google.gson.stream.JsonReader
import com.omaemirates.R
import com.omaemirates.common.ApiResponse
import com.omaemirates.model.DataModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class DataRepository @Inject constructor(private val application: Application) {

    suspend fun getApiData(): ApiResponse<DataModel> = withContext(Dispatchers.IO) {
        application.resources.openRawResource(R.raw.task).use { inputStream ->
            JsonReader(inputStream.reader()).use { jsonReader ->
                try {
                    ApiResponse.Success(Gson().fromJson(jsonReader, DataModel::class.java))
                } catch (ex: Exception) {
                    ApiResponse.Failure(ex)
                }
            }
        }
    }
}
