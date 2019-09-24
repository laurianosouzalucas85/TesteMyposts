package com.example.myposts.presentation.presentation.Posts

import android.telecom.Call
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myposts.R
import com.example.myposts.data.ApiServices
import com.example.myposts.data.model.Posts
import com.example.myposts.data.response.PostsBodyResponse
import okhttp3.Response
import javax.security.auth.callback.Callback

class PostsViewModel : ViewModel() {

    val postsLiveData: MutableLiveData<List<Posts>> = MutableLiveData()
    val viewFlipperLiveData: MutableLiveData<Pair<Int, Int?>> = MutableLiveData()

    /*fun getPosts() {
        ApiServices.service.getPosts().enqueue(object : Callback<PostsBodyResponse> {
            override fun onResponse(
                call: Call<PostsBodyResponse>,
                response: Response<PostsBodyResponse>
            ) = when {
                response.isSuccessful -> {
                    val posts: MutableList<Posts> = mutableListOf()

                    response.body()?.let { postsBodyResponse ->
                        for (result in postsBodyResponse.postsResults) {
                            val book = result.postsDetailResponses[0].getPostsModel()
                            posts.add(posts)
                        }
                    }

                    postsLiveData.value = posts
                    viewFlipperLiveData.value = Pair(VIEW_FLIPPER_POSTS, null)
                }
                response.code() == 401 -> viewFlipperLiveData.value =
                    Pair(VIEW_FLIPPER_ERROR, R.string.posts_error_401)
                else -> viewFlipperLiveData.value =
                    Pair(VIEW_FLIPPER_ERROR, R.string.posts__error_400_generic)
            }

            override fun onFailure(call: Call<PostsBodyResponse>, t: Throwable) {
                viewFlipperLiveData.value =
                    Pair(VIEW_FLIPPER_ERROR, R.string.posts__error_500_generic)
            }
        })
    }

    companion object {
        private const val VIEW_FLIPPER_POSTS = 1
        private const val VIEW_FLIPPER_ERROR = 2
    }*/

}