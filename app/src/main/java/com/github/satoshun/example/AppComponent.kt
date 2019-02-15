package com.github.satoshun.example

import android.content.Context
import dagger.BindsInstance
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@dagger.Component(
  modules = [
    AndroidSupportInjectionModule::class,
    AppFeatureModule::class
  ]
)
interface AppComponent : AndroidInjector<App> {
  @dagger.Component.Builder
  abstract class Builder : AndroidInjector.Builder<App>() {
    @BindsInstance abstract fun applicationContext(context: Context): Builder
  }
}
