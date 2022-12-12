package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class DataModel(

    @SerializedName("Result") var Result: Result? = Result()

)