package com.example.myposts.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class PostsResultsResponse(
    @Json(name = "posts_details")
    val postsDetailResponses: List<PostsDetailsResponse>
)