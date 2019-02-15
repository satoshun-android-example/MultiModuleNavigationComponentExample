package com.github.satoshun.example.feature.router

import androidx.navigation.NavController
import com.github.satoshun.example.feature.main.MainFragmentDirections
import com.github.satoshun.example.feature.main.MainModuleRouter
import com.github.satoshun.example.feature.sub1.Sub1FragmentDirections
import com.github.satoshun.example.feature.sub1.Sub1ModuleRouter
import javax.inject.Inject

class MainModuleRouterImpl @Inject constructor(
  private val controller: NavController
) : MainModuleRouter {
  override fun routeToSub1() {
    controller.navigate(MainFragmentDirections.mainToSub1())
  }
}

class Sub1ModuleRouterImpl @Inject constructor(
  private val controller: NavController
) : Sub1ModuleRouter {
  override fun routeToMain() {
    controller.navigate(Sub1FragmentDirections.sub1ToMain())
  }
}
