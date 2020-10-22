package com.example.coindex.data.remote.dto

import com.example.coindex.domain.model.Coin
import com.google.gson.annotations.SerializedName

data class CoinDto(
    @SerializedName("id")
    val id: String,
    @SerializedName("is_active