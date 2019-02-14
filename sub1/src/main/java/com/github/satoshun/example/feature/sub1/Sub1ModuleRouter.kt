package com.github.satoshun.example.feature.sub1

import android.content.Context
import android.content.Intent

interface Sub1ModuleRouter {
  fun routeToMain(context: Context): Intent
}
