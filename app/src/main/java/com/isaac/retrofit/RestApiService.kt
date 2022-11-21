package com.isaac.retrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
class RestApiService {
    fun addUser(userData: UserInfo, onResult: (UserInfo?) -> Unit){
        val retrofit = ServiceBuilder.buildService(RestApi::class.java)
        retrofit.addUser(userData).enqueue(
            object : Callback<UserInfo> {
                override fun onFailure(call: Call<UserInfo>, t: Throwable) {
                    println("Eroooooooooooooooo"+t.message)
                    //onResult(null)
                }
                override fun onResponse( call: Call<UserInfo>, response: Response<UserInfo>) {
                    val code = response.code()
                    println(""+code)
                    if (code==200){
                        println("Worked . Suceess")
                    }

                    else if(code==401){
                        println("Worked . Wrong Email")
                    }

                    else if(code==400){
                        println("Worked . Login Failed")
                    }

                    else {
                        println("Worked . Server Error")
                    }

                }
            }
        )
    }
}