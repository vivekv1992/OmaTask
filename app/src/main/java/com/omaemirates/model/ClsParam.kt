package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class ClsParam (

  @SerializedName("clsVersion"  ) var clsVersion  : String?      = null,
  @SerializedName("clsTerminal" ) var clsTerminal : ClsTerminal? = ClsTerminal(),
  @SerializedName("kernel"      ) var kernel      : Kernel?      = Kernel()

)