package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class Aids (

  @SerializedName("aidName" ) var aidName : String? = null,
  @SerializedName("selFlag" ) var selFlag : String? = null

)