package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class CaKeyParamMain(

    @SerializedName("caKeyVersion") var caKeyVersion: String? = null,
    @SerializedName("caKeyParam") var caKeyParam: ArrayList<CaKeyParam> = arrayListOf()

)