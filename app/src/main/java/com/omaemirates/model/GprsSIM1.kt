package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class GprsSIM1 (

  @SerializedName("isEnable" ) var isEnable : Boolean? = null,
  @SerializedName("apn"      ) var apn      : String?  = null,
  @SerializedName("userName" ) var userName : String?  = null,
  @SerializedName("password" ) var password : String?  = null,
  @SerializedName("priority" ) var priority : String?  = null

)