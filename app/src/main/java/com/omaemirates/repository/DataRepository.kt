package com.omaemirates.repository

import android.app.Application
import com.google.gson.Gson
import com.google.gson.stream.JsonReader
import com.omaemirates.R
import com.omaemirates.model.MainDataModel
import com.omaemirates.viewmodel.MainViewModel
import javax.inject.Inject

class DataRepository @Inject constructor(private val application: Application) {

    fun getTextJSON() {
        application.resources.openRawResource(R.raw.task).use { inputStream ->
            JsonReader(inputStream.reader()).use { jsonReader ->
                try {
                    val mainViewModel =
                        Gson().fromJson<MainViewModel>(jsonReader, MainDataModel::class.java)
                } catch (ex: Exception) {
                    ex.printStackTrace()
                }
            }
        }
    }
}
