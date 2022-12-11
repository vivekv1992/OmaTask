package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class ClsTerminal (

  @SerializedName("emvMode"             ) var emvMode             : String? = null,
  @SerializedName("autoRun"             ) var autoRun             : String? = null,
  @SerializedName("fixedAmt"            ) var fixedAmt            : String? = null,
  @SerializedName("acqId"               ) var acqId               : String? = null,
  @SerializedName("terminalType"        ) var terminalType        : String? = null,
  @SerializedName("terminalCountryCode" ) var terminalCountryCode : String? = null

)