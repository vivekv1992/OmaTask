package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class Merchant (

  @SerializedName("slogan1"        ) var slogan1        : String?  = null,
  @SerializedName("slogan2"        ) var slogan2        : String?  = null,
  @SerializedName("cardHolderName" ) var cardHolderName : Boolean? = null

)