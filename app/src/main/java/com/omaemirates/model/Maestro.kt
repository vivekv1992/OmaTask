package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class Maestro (

  @SerializedName("kernelId"                     ) var kernelId                     : String?         = null,
  @SerializedName("versionNumber"                ) var versionNumber                : String?         = null,
  @SerializedName("flrLimit"                     ) var flrLimit                     : String?         = null,
  @SerializedName("cvmLimit"                     ) var cvmLimit                     : String?         = null,
  @SerializedName("txnLimit"                     ) var txnLimit                     : String?         = null,
  @SerializedName("terminalCapability"           ) var terminalCapability           : String?         = null,
  @SerializedName("addTerminalCapability"        ) var addTerminalCapability        : String?         = null,
  @SerializedName("securityCapability"           ) var securityCapability           : String?         = null,
  @SerializedName("defaultTAC"                   ) var defaultTAC                   : String?         = null,
  @SerializedName("denialTAC"                    ) var denialTAC                    : String?         = null,
  @SerializedName("onlineTAC"                    ) var onlineTAC                    : String?         = null,
  @SerializedName("aidOption"                    ) var aidOption                    : String?         = null,
  @SerializedName("tcc"                          ) var tcc                          : String?         = null,
  @SerializedName("tdol"                         ) var tdol                         : String?         = null,
  @SerializedName("suppLanguage"                 ) var suppLanguage                 : String?         = null,
  @SerializedName("cardDataInputCap"             ) var cardDataInputCap             : String?         = null,
  @SerializedName("chipCVMCapabitlityReq"        ) var chipCVMCapabitlityReq        : String?         = null,
  @SerializedName("chipCVMCapabitlityNotReq"     ) var chipCVMCapabitlityNotReq     : String?         = null,
  @SerializedName("payPassUDOL"                  ) var payPassUDOL                  : String?         = null,
  @SerializedName("kernelConfiguration"          ) var kernelConfiguration          : String?         = null,
  @SerializedName("magStripeVersion"             ) var magStripeVersion             : String?         = null,
  @SerializedName("magStripeCVMCapabilityReq"    ) var magStripeCVMCapabilityReq    : String?         = null,
  @SerializedName("magStripeCVMCapabilityNotReq" ) var magStripeCVMCapabilityNotReq : String?         = null,
  @SerializedName("cLessLimitNoDCV"              ) var cLessLimitNoDCV              : String?         = null,
  @SerializedName("cLessLimitDCV"                ) var cLessLimitDCV                : String?         = null,
  @SerializedName("riskManagement"               ) var riskManagement               : String?         = null,
  @SerializedName("aids"                         ) var aids                         : ArrayList<Aids> = arrayListOf()

)