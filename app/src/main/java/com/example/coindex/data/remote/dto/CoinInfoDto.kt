package com.example.coindex.data.remote.dto

import com.example.coindex.domain.model.CoinInfo
import com.google.gson.annotations.SerializedName

data class CoinInfoDto(
    @SerializedName("description")
    val description: String,
    @SerializedName("development_status")
    val developmentStatus: String,
    @SerializedName("first_data_at")
    val firstDataAt: String,
    @SerializedName("hardware_wallet")
    val hardwareWallet: B