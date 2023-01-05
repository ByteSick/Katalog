package com.example.coindex.data.repository

import com.example.coindex.data.remote.CoinApi
import com.example.coindex.data.remote.dto.CoinDto
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.mockito.Mock
import org.mockito.MockitoAnnotations

//I tried testing with both Junit and Mockito, but I couldn't get it to work in time
class CoinRepositoryImplTest {

        @Mock
         lateinit var coinApi: CoinApi

        private lateinit var coinRepository: CoinRepositoryImpl

        @BeforeEach
        fun setUp() {
            MockitoAnnotations.initMocks(this)
            coinRepository = CoinRepositoryImpl(coinApi)
        }
        @Test

        suspend fun `getCoins() calls coinApi`(){
            val coins = listOf(CoinDto(
                id = "1",
                isActive = true,
                isNew = true,
                name = "name", rank = 1,
                symbol = "symbol",
                type = "type"))
            coinRepository.getCoins()
            assertEquals(coins, coinRepository.getCo