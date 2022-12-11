package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class Kernel (

  @SerializedName("visa"    ) var visa    : Visa?    = Visa(),
  @SerializedName("master"  ) var master  : Master?  = Master(),
  @SerializedName("maestro" ) var maestro : Maestro? = Maestro(),
  @SerializedName("cup"     ) var cup     : String?  = null,
  @SerializedName("amex"    ) var amex    : String?  = null,
  @SerializedName("jcb"     ) var jcb     : String?  = null,
  @SerializedName("e11"     ) var e11     : E11?     = E11()

)