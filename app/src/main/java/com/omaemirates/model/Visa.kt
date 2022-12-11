package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class Visa (

  @SerializedName("kernelId"               ) var kernelId               : String?         = null,
  @SerializedName("flrLimit"               ) var flrLimit               : String?         = null,
  @SerializedName("cvmLimit"               ) var cvmLimit               : String?         = null,
  @SerializedName("txnLimit"               ) var txnLimit               : String?         = null,
  @SerializedName("ttq"                    ) var ttq                    : String?         = null,
  @SerializedName("terminalCapability"     ) var terminalCapability     : String?         = null,
  @SerializedName("addTerminalCapability"  ) var addTerminalCapability  : String?         = null,
  @SerializedName("defaultTAC"             ) var defaultTAC             : String?         = null,
  @SerializedName("denialTAC"              ) var denialTAC              : String?         = null,
  @SerializedName("onlineTAC"              ) var onlineTAC              : String?         = null,
  @SerializedName("kernelConfiguration"    ) var kernelConfiguration    : String?         = null,
  @SerializedName("zeroAmountFlag"         ) var zeroAmountFlag         : String?         = null,
  @SerializedName("tdol"                   ) var tdol                   : String?         = null,
  @SerializedName("terminalSuppLang"       ) var terminalSuppLang       : String?         = null,
  @SerializedName("riskManagement"         ) var riskManagement         : String?         = null,
  @SerializedName("dccctlessratelookupamt" ) var dccctlessratelookupamt : String?         = null,
  @SerializedName("aids"                   ) var aids                   : ArrayList<Aids> = arrayListOf()

)