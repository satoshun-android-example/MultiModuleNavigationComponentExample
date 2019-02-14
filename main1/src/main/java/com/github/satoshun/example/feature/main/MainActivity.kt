package com.github.satoshun.example.feature.main

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
  @Inject lateinit var moduleRouter: MainModuleRouter

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_act)

    findViewById<View>(R.id.route).setOnClickListener {
      val intent = moduleRouter.routeToSub1(this)
      startActivity(intent)
    }
  }
}

