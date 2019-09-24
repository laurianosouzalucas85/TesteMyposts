package com.example.myposts.data


import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


object ApiServices {

    private fun initRetrofit(): Retrofit {

        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/posts/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        return Retrofit.Builder()
            .baseUrl(": https://jsonplaceholder.typicode.com/comments")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

    }

    val service: POSTServices = initRetrofit().create(POSTServices::class.java)
}