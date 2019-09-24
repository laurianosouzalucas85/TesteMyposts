package com.example.myposts.presentation.presentation.Posts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myposts.R
import com.example.myposts.presentation.presentation.details.PostsDetailsActivity
import kotlinx.android.synthetic.main.activity_posts.*
import kotlinx.android.synthetic.main.include_toolbar.*

class PostsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posts)

        //setupToolbar(toolbarMain, R.string.posts_title)

        val viewModel: PostsViewModel = ViewModelProviders.of(this).get(PostsViewModel::class.java)

        viewModel.postsLiveData.observe(this, Observer {
            it?.let { posts ->
                with(recyclerPosts) {
                    //layoutManager = LinearLayoutManager(this@PostsActivity, RecyclerView.VERTICAL, false)
                   // setHasFixedSize(true)
                    PostsAdapter(posts) { posts ->
                        val intent = PostsDetailsActivity.getStartIntent(this@PostsActivity,
                            posts.title,
                            posts.body
                        )
                        this@PostsActivity.startActivity(intent)
                    }
                }
            }
        })

        viewModel.viewFlipperLiveData.observe(this, Observer {
            it?.let { viewFlipper ->
                viewFlipperPosts.displayedChild = viewFlipper.first

                viewFlipper.second?.let { errorMessageResId ->
                    textViewError.text = getString(errorMessageResId)
                }
            }
        })

        //viewModel.getPosts()
    }


    // override fun onCreate(savedInstanceState: Bundle?) {
    //  super.onCreate(savedInstanceState)
    //  setContentView(R.layout.activity_posts)


    //  toolbarMain.title = getString(R.string.posts_title)
    //  setSupportActionBar(toolbarMain)

    // val viewModel: PostsViewModel = ViewModelProviders.of(this).get(PostsViewModel::class.java)

    //  viewModel.postsLiveData.observe(this, Observer {
    //    it?.let { posts ->
    //       with(recyclerPosts) {
    // layoutManager = LinearLayoutManager(this@PostsActivity, RecyclerView.VERTICAL, false)
    // setHasFixedSize(true)
    //  adapter = PostsAdapter(posts)


    // }
    //}
    // }//)

    //  viewModel.getPosts()

//}
}