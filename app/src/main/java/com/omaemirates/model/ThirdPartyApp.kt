package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class ThirdPartyApp (

  @SerializedName("sim1" ) var sim1 : String? = null,
  @SerializedName("sim2" ) var sim2 : String? = null,
  @SerializedName("wifi" ) var wifi : String? = null

)