package com.github.satoshun.example.feature.di

import com.github.satoshun.example.feature.sub1.Sub1Builder
import dagger.Module

@Module(
  includes = [
    Sub1Builder::class
  ]
)
interface DiBuilder
