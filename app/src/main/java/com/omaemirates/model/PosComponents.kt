package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class PosComponents (

  @SerializedName("appVersion"        ) var appVersion        : String? = null,
  @SerializedName("configVersion"     ) var configVersion     : String? = null,
  @SerializedName("emvVersion"        ) var emvVersion        : String? = null,
  @SerializedName("expresspayVersion" ) var expresspayVersion : String? = null,
  @SerializedName("ftpVersion"        ) var ftpVersion        : String? = null,
  @SerializedName("linkLayerVersion"  ) var linkLayerVersion  : String? = null,
  @SerializedName("managerVersion"    ) var managerVersion    : String? = null,
  @SerializedName("osVersion"         ) var osVersion         : String? = null,
  @SerializedName("paypassVersion"    ) var paypassVersion    : String? = null,
  @SerializedName("paywaveVersion"    ) var paywaveVersion    : String? = null,
  @SerializedName("quickpassVersion"  ) var quickpassVersion  : String? = null,
  @SerializedName("sdkVersion"        ) var sdkVersion        : String? = null,
  @SerializedName("sslVersion"        ) var sslVersion        : String? = null

)