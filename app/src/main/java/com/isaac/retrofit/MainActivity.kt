package com.isaac.retrofit
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addDummyUser()
    }

    fun addDummyUser() {
        val apiService = RestApiService()
        val userInfo = UserInfo(
            userEmail = "oumffa@gmail.com",
            userPassword = "nairobi1234")

        apiService.addUser(userInfo) {
              println("This one "+it.toString())
        }
    }
}