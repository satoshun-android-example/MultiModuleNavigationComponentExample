package com.github.satoshun.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class AppActivity : AppCompatActivity(), HasSupportFragmentInjector {
  @Inject lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.app_act)
  }

  override fun supportFragmentInjector(): AndroidInjector<Fragment> =
    fragmentInjector

  override fun onSupportNavigateUp(): Boolean =
    findNavController(R.id.nav_host_fragment).navigateUp()
}
