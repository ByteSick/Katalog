package com.example.coindex.di

import com.example.coindex.utils.Constants
import com.example.coindex.data.remote.CoinApi
import com.example.coindex.data.repository.CoinRepositoryImpl
import com.example.coindex.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.conve