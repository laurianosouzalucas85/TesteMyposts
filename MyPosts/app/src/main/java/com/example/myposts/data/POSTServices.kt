package com.example.myposts.data


import com.example.myposts.data.response.PostsBodyResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.Call


interface POSTServices {
    //@GET("list.json")
    //fun  listRepos(): Call<List<>>
    @GET("lists.json")
    fun getPosts(
        @Query("api-key") apiKey: String = "1",
        @Query("list") list: String = "1"
    ): Call<PostsBodyResponse>
}