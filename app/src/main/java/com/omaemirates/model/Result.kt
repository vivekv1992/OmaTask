package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class Result (

  @SerializedName("status"      ) var status      : Int?    = null,
  @SerializedName("description" ) var description : String? = null,
  @SerializedName("data"        ) var data        : Data?   = Data()

)