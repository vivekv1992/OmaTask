package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class E11 (

  @SerializedName("kernelId"              ) var kernelId              : String?         = null,
  @SerializedName("versionNumber"         ) var versionNumber         : String?         = null,
  @SerializedName("flrLimit"              ) var flrLimit              : String?         = null,
  @SerializedName("cvmLimit"              ) var cvmLimit              : String?         = null,
  @SerializedName("txnLimit"              ) var txnLimit              : String?         = null,
  @SerializedName("ttq"                   ) var ttq                   : String?         = null,
  @SerializedName("terminalCapability"    ) var terminalCapability    : String?         = null,
  @SerializedName("addTerminalCapability" ) var addTerminalCapability : String?         = null,
  @SerializedName("defaultTAC"            ) var defaultTAC            : String?         = null,
  @SerializedName("denialTAC"             ) var denialTAC             : String?         = null,
  @SerializedName("onlineTAC"             ) var onlineTAC             : String?         = null,
  @SerializedName("kernelConfiguration"   ) var kernelConfiguration   : String?         = null,
  @SerializedName("aidOption"             ) var aidOption             : String?         = null,
  @SerializedName("termFloorlimit"        ) var termFloorlimit        : String?         = null,
  @SerializedName("tdol"                  ) var tdol                  : String?         = null,
  @SerializedName("suppLanguage"          ) var suppLanguage          : String?         = null,
  @SerializedName("aids"                  ) var aids                  : ArrayList<Aids> = arrayListOf()

)