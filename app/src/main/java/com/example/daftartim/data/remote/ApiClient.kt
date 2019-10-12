package com.example.daftartim.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class ApiClient {
    companion object{

        fun create(): Repository{
            val retrofit = Retrofit.Builder()
                .addConverterFactory(
                    GsonConverterFactory.create())
                .baseUrl("https://www.thesportsdb.com/api/v1/json/")
                .build()

            return retrofit.create(Repository::class.java)
                }
        }
    }