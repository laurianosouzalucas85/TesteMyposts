package com.example.myposts.presentation.presentation.details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toolbar
import com.example.myposts.R
//import com.example.myposts.presentation.base.BaseActivity
import com.example.myposts.presentation.presentation.base.BaseActivity
import kotlinx.android.synthetic.main.include_toolbar.*



class PostsDetailsActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posts_details)

        setupToolbar(toolbarMain as Toolbar, R.string.posts__details_title, true)
        //postsDetailsTitle.text = intent.getStringExtra(EXTRA_TITLE)

       // postsDetailsBody.text = intent.getStringExtra(EXTRA_BODY)


    }

    companion object {
        private const val EXTRA_TITLE = "EXTRA_TITLE"
        private const val EXTRA_BODY = "EXTRA_BODY"

        fun getStartIntent(context: Context, title: String, body: String): Intent {
            return Intent(context, PostsDetailsActivity::class.java).apply {
                putExtra(EXTRA_TITLE, title)
                putExtra(EXTRA_BODY, body)
            }
        }
    }


}