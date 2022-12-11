package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class CaKeyParam(

    @SerializedName("caKeyVersion") var caKeyVersion: String? = null,
    @SerializedName("caKeyParam") var caKeyParam: ArrayList<CaKeyParam> = arrayListOf()

)