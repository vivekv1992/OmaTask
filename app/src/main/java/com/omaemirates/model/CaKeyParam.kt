package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class CaKeyParam(

    @SerializedName("rid") var rid: String? = null,
    @SerializedName("ridIndex") var ridIndex: String? = null,
    @SerializedName("expdate") var expdate: String? = null,
    @SerializedName("hashInd") var hashInd: String? = null,
    @SerializedName("arithInd") var arithInd: String? = null,
    @SerializedName("modulus") var modulus: String? = null,
    @SerializedName("exponent") var exponent: String? = null,
    @SerializedName("checksum") var checksum: String? = null

)