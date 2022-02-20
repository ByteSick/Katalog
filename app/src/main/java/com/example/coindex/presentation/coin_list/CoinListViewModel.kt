package com.example.coindex.presentation.coin_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coindex.utils.Resource
import com.example.coindex.domain.use_case.get_coins.GetCoins
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.co