package com.bigpro.mibird.network.responsemodel
import com.google.gson.annotations.SerializedName

data class Default (
    @SerializedName("user")
    var username:String?,
    @SerializedName("pass")
    var Password:String?,



)