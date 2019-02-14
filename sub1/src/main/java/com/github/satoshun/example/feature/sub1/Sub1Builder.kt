package com.github.satoshun.example.feature.sub1

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(
  includes = [Sub1ActivityModule::class]
)
interface Sub1Builder

@Module
internal interface Sub1ActivityModule {
  @ContributesAndroidInjector fun contributeSub1Activity(): Sub1Activity
}