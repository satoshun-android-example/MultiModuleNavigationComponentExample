package com.github.satoshun.example.feature.main

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(
  includes = [MainFragmentModule::class]
)
interface MainFeatureModule

@Module
internal interface MainFragmentModule {
  @ContributesAndroidInjector fun contributeMainFragment(): MainFragment
}
