package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class GprsPrimary (

  @SerializedName("isSSL"           ) var isSSL           : Boolean? = null,
  @SerializedName("isSSLCaching"    ) var isSSLCaching    : Boolean? = null,
  @SerializedName("ip"              ) var ip              : String?  = null,
  @SerializedName("port"            ) var port            : String?  = null,
  @SerializedName("connTimeout"     ) var connTimeout     : String?  = null,
  @SerializedName("responseTimeout" ) var responseTimeout : String?  = null

)