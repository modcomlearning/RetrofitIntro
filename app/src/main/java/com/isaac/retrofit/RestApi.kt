package com.isaac.retrofit
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
interface RestApi {
    @Headers("Content-Type: application/json")
    @POST("login")
    fun addUser(@Body userData: UserInfo): Call<UserInfo>
}