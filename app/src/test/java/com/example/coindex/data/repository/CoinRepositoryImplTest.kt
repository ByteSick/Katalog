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
         lateinit 