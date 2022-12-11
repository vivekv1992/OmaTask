package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class Data (

  @SerializedName("configParam"         ) var configParam         : ConfigParam?         = ConfigParam(),
  @SerializedName("emvParam"            ) var emvParam            : EmvParam?            = EmvParam(),
  @SerializedName("clsParam"            ) var clsParam            : ClsParam?            = ClsParam(),
  @SerializedName("caKeyParam"          ) var caKeyParam          : CaKeyParam?          = CaKeyParam(),
  @SerializedName("receiptParam"        ) var receiptParam        : ReceiptParam?        = ReceiptParam(),
  @SerializedName("tmsConnParam"        ) var tmsConnParam        : TmsConnParam?        = TmsConnParam(),
  @SerializedName("KeyValueConfigParam" ) var KeyValueConfigParam : KeyValueConfigParam? = KeyValueConfigParam(),
  @SerializedName("paramNOL"            ) var paramNOL            : ParamNOL?            = ParamNOL(),
  @SerializedName("posComponents"       ) var posComponents       : PosComponents?       = PosComponents()

)