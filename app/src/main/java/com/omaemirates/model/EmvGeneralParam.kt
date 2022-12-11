package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class EmvGeneralParam (

  @SerializedName("referCurrCon"         ) var referCurrCon         : String? = null,
  @SerializedName("merchName"            ) var merchName            : String? = null,
  @SerializedName("merchId"              ) var merchId              : String? = null,
  @SerializedName("merchCategoryCode"    ) var merchCategoryCode    : String? = null,
  @SerializedName("termId"               ) var termId               : String? = null,
  @SerializedName("termNo"               ) var termNo               : String? = null,
  @SerializedName("operatorName"         ) var operatorName         : String? = null,
  @SerializedName("termType"             ) var termType             : String? = null,
  @SerializedName("terminalCapability"   ) var terminalCapability   : String? = null,
  @SerializedName("extAddTermCapability" ) var extAddTermCapability : String? = null,
  @SerializedName("transCurrCode"        ) var transCurrCode        : String? = null,
  @SerializedName("transCurrExp"         ) var transCurrExp         : String? = null,
  @SerializedName("referCurrCode"        ) var referCurrCode        : String? = null,
  @SerializedName("referCurrExp"         ) var referCurrExp         : String? = null,
  @SerializedName("countryCode"          ) var countryCode          : String? = null

)