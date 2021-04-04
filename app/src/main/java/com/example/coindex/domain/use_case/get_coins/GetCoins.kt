
package com.example.coindex.domain.use_case.get_coins

import com.example.coindex.utils.Resource
import com.example.coindex.data.map.toCoin
import com.example.coindex.domain.model.Coin
import com.example.coindex.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoins @Inject constructor(