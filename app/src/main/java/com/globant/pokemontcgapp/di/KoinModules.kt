package com.globant.pokemontcgapp.di

import com.globant.pokemontcgapp.viewmodel.SplashScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel { SplashScreenViewModel() }
}