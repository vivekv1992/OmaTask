package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class EmvParam (

  @SerializedName("emvVersion"      ) var emvVersion      : String?          = null,
  @SerializedName("emvGeneralParam" ) var emvGeneralParam : EmvGeneralParam? = EmvGeneralParam(),
  @SerializedName("aids"            ) var aids            : ArrayList<Aids>  = arrayListOf()

)