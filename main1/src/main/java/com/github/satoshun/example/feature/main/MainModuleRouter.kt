package com.github.satoshun.example.feature.main

import android.content.Context
import android.content.Intent

interface MainModuleRouter {
  fun routeToSub1(context: Context): Intent
}
