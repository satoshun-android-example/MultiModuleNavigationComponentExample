package com.github.satoshun.example

import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.github.satoshun.example.feature.main.MainFeatureModule
import com.github.satoshun.example.feature.main.MainModuleRouter
import com.github.satoshun.example.feature.router.MainModuleRouterImpl
import com.github.satoshun.example.feature.router.Sub1ModuleRouterImpl
import com.github.satoshun.example.feature.sub1.Sub1FeatureModule
import com.github.satoshun.example.feature.sub1.Sub1ModuleRouter
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
interface AppFeatureModule {
  @ContributesAndroidInjector(
    modules = [
      AppActivityModule::class,
      MainFeatureModule::class,
      Sub1FeatureModule::class
    ]
  )
  fun contributeAppActivity(): AppActivity
}

@Module
class AppActivityModule {
  @Provides
  fun provideController(activity: AppActivity): NavController {
    return activity.findNavController(R.id.nav_host_fragment)
  }

  @Provides
  fun provideMainModuleRouter(impl: MainModuleRouterImpl): MainModuleRouter = impl

  @Provides
  fun provideSub1ModuleRouter(impl: Sub1ModuleRouterImpl): Sub1ModuleRouter = impl
}
