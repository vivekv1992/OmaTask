package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class ConfigParam (

  @SerializedName("termId"                  ) var termId                  : String?  = null,
  @SerializedName("helpDeskNumber"          ) var helpDeskNumber          : String?  = null,
  @SerializedName("countryCode"             ) var countryCode             : String?  = null,
  @SerializedName("currencyCodeAlpha"       ) var currencyCodeAlpha       : String?  = null,
  @SerializedName("currencyCodeNumeric"     ) var currencyCodeNumeric     : String?  = null,
  @SerializedName("currencyCodeExponent"    ) var currencyCodeExponent    : String?  = null,
  @SerializedName("merchId"                 ) var merchId                 : String?  = null,
  @SerializedName("merchName"               ) var merchName               : String?  = null,
  @SerializedName("merchAdrL1"              ) var merchAdrL1              : String?  = null,
  @SerializedName("merchAdrL2"              ) var merchAdrL2              : String?  = null,
  @SerializedName("merchAdrL3"              ) var merchAdrL3              : String?  = null,
  @SerializedName("merchZipCode"            ) var merchZipCode            : String?  = null,
  @SerializedName("merchCity"               ) var merchCity               : String?  = null,
  @SerializedName("merchCountry"            ) var merchCountry            : String?  = null,
  @SerializedName("adminPassword"           ) var adminPassword           : String?  = null,
  @SerializedName("screenLockPassword"      ) var screenLockPassword      : String?  = null,
  @SerializedName("superVisorPassword"      ) var superVisorPassword      : String?  = null,
  @SerializedName("defaultTransaction"      ) var defaultTransaction      : String?  = null,
  @SerializedName("isDCCEnabled"            ) var isDCCEnabled            : Boolean? = null,
  @SerializedName("maxPendingReversalCount" ) var maxPendingReversalCount : Int?     = null,
  @SerializedName("askRefundAuthCode"       ) var askRefundAuthCode       : Boolean? = null,
  @SerializedName("enableNol"               ) var enableNol               : Boolean? = null,
  @SerializedName("nolDeviceId"             ) var nolDeviceId             : String?  = null,
  @SerializedName("samId"                   ) var samId                   : String?  = null,
  @SerializedName("encryptedSam"            ) var encryptedSam            : String?  = null,
  @SerializedName("isProgramdownload"       ) var isProgramdownload       : Boolean? = null,
  @SerializedName("isLogUpload"             ) var isLogUpload             : Boolean? = null

)