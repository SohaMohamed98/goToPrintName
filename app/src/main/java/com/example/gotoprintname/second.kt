package com.example.gotoprintname

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

         var data=intent
        var myName= data.extras?.getString("my_name")
        var myAge= data.extras?.getString("my_age")
        var myPhone= data.extras?.getString("my_phone")

        get_name.text=myName
        get_age.text= myAge
        get_phone.text=myPhone
    }
}
