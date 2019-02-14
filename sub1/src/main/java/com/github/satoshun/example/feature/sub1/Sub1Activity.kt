package com.github.satoshun.example.feature.sub1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.sub1_act.*
import javax.inject.Inject

class Sub1Activity : AppCompatActivity(),
  Sub1Contract.View {

  @Inject lateinit var moduleRouter: Sub1ModuleRouter

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.sub1_act)

    val presenter = object : Sub1Contract.Presenter {}

    button.setOnClickListener {
      val intent = moduleRouter.routeToMain(this)
      startActivity(intent)
    }
  }
}
