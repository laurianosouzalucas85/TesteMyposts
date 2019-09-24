package com.example.myposts.presentation.presentation.base

import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity


open class BaseActivity : AppCompatActivity() {

    protected fun setupToolbar(toolbar: Toolbar, titleIdRes: Int, showBackButton: Boolean = false) {
        toolbar.title = getString(titleIdRes)
        setSupportActionBar(toolbar)
        if (showBackButton) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
    }

    private fun setSupportActionBar(toolbar: Toolbar) {

    }
}