package com.example.myposts.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PostsBodyResponse(
    @Json(name = "results")
    val postsResults: List<PostsResultsResponse>
)