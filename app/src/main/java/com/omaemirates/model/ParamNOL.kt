package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class ParamNOL (

  @SerializedName("nolAid"                    ) var nolAid                    : String?           = null,
  @SerializedName("offlineSingleTxnAmtLimit"  ) var offlineSingleTxnAmtLimit  : String?           = null,
  @SerializedName("offlineApprovedCountLimit" ) var offlineApprovedCountLimit : String?           = null,
  @SerializedName("beId"                      ) var beId                      : String?           = null,
  @SerializedName("mercuryBiN"                ) var mercuryBiN                : String?           = null,
  @SerializedName("max"                       ) var max                       : String?           = null,
  @SerializedName("tcpPrimaryIp"              ) var tcpPrimaryIp              : String?           = null,
  @SerializedName("tcpPrimaryPort"            ) var tcpPrimaryPort            : String?           = null,
  @SerializedName("tcpSecondaryIp"            ) var tcpSecondaryIp            : String?           = null,
  @SerializedName("tcpSecondaryPort"          ) var tcpSecondaryPort          : String?           = null,
  @SerializedName("gprsPrimaryIp"             ) var gprsPrimaryIp             : String?           = null,
  @SerializedName("gprsPrimaryPort"           ) var gprsPrimaryPort           : String?           = null,
  @SerializedName("gprsSecondaryIp"           ) var gprsSecondaryIp           : String?           = null,
  @SerializedName("gprsSecondaryPort"         ) var gprsSecondaryPort         : String?           = null,
  @SerializedName("nolCardtypeItems"          ) var nolCardtypeItems          : ArrayList<String> = arrayListOf()

)