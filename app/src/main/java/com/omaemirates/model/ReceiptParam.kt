package com.omaemirates.model

import com.google.gson.annotations.SerializedName


data class ReceiptParam (

  @SerializedName("receiptParamVersion" ) var receiptParamVersion : String?   = null,
  @SerializedName("merchant"            ) var merchant            : Merchant? = Merchant(),
  @SerializedName("customer"            ) var customer            : Customer? = Customer()

)