package com.example.coindex.domain.use_case.get_coin

import com.example.coindex.utils.Resource
import com.example.coindex.domain.model.CoinInfo
import com.example.coindex.data.map.toCoinInfo
import com.example.coindex.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoin @Inject constructor(
    private val coinReposito