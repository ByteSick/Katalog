package com.example.coindex.presentation

sealed class Screen(val route:String) {
    object CoinListScreen: Screen("coin_list_screen")
    ob