package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class TmsConnParam (

  @SerializedName("tmsConnParamVersion" ) var tmsConnParamVersion : String?            = null,
  @SerializedName("gprsPrimary"         ) var gprsPrimary         : GprsPrimary?       = GprsPrimary(),
  @SerializedName("gprsSecondary"       ) var gprsSecondary       : GprsSecondary?     = GprsSecondary(),
  @SerializedName("gprsSIM1"            ) var gprsSIM1            : GprsSIM1?          = GprsSIM1(),
  @SerializedName("gprsSIM2"            ) var gprsSIM2            : GprsSIM2?          = GprsSIM2(),
  @SerializedName("tcpPrimary"          ) var tcpPrimary          : TcpPrimary?        = TcpPrimary(),
  @SerializedName("tcpSecondary"        ) var tcpSecondary        : TcpSecondary?      = TcpSecondary(),
  @SerializedName("gprsAuthPrimary"     ) var gprsAuthPrimary     : GprsAuthPrimary?   = GprsAuthPrimary(),
  @SerializedName("gprsAuthSecondary"   ) var gprsAuthSecondary   : GprsAuthSecondary? = GprsAuthSecondary(),
  @SerializedName("thirdPartyApp"       ) var thirdPartyApp       : ThirdPartyApp?     = ThirdPartyApp()

)