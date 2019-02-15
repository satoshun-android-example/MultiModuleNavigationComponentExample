package com.github.satoshun.example.feature.router

import android.content.Context
import androidx.navigation.NavController
import com.github.satoshun.example.feature.main.MainModuleRouter
import com.github.satoshun.example.feature.sub1.Sub1ModuleRouter
import javax.inject.Inject

class MainModuleRouterImpl @Inject constructor(
  private val controller: NavController
) : MainModuleRouter {
  override fun routeToSub1(context: Context) {
    controller.navigate(R.id.nav_sub1_frag)
  }
}

class Sub1ModuleRouterImpl @Inject constructor(
  private val controller: NavController
) : Sub1ModuleRouter {
  override fun routeToMain(context: Context) {
    controller.navigate(R.id.nav_main_frag)
  }
}
