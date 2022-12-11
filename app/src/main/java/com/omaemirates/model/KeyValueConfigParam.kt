package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class KeyValueConfigParam (

  @SerializedName("parmKeyConfigList" ) var parmKeyConfigList : ArrayList<ParmKeyConfigList> = arrayListOf()

)