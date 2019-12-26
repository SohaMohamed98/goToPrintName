package com.example.gotoprintname

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_sign.setOnClickListener {


            var intent=Intent(this,second::class.java)
            var name=text_name.text.toString()
            var age: String =text_age.text.toString()
            var phone=text_phone.text.toString()

            intent.putExtra("my_name",name)
            intent.putExtra("my_age",age)
            intent.putExtra("my_phone",phone)

            startActivity(intent)
        }

    }

}
