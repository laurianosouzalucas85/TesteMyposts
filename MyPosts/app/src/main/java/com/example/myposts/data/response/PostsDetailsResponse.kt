package com.example.myposts.data.response

import com.example.myposts.data.model.Posts
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PostsDetailsResponse(
    @Json(name = "title")
    val title: String,

    @Json(name = "body")
    val body: String
) {
    fun getPostModel() = Posts(
        title = this.title,
        body = this.body

    )
}
