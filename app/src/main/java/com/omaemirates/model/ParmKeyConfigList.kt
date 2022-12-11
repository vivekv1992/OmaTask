package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class ParmKeyConfigList (

  @SerializedName("KeyName"  ) var KeyName  : String? = null,
  @SerializedName("KeyValue" ) var KeyValue : String? = null

)