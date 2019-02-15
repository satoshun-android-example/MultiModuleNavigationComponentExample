package com.github.satoshun.example.feature.sub1

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(
  includes = [Sub1FragmentModule::class]
)
interface Sub1FeatureModule

@Module
internal interface Sub1FragmentModule {
  @ContributesAndroidInjector fun contributeSub1Fragment(): Sub1Fragment
}
