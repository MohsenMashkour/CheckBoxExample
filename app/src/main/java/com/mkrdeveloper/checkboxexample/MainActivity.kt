package com.mkrdeveloper.checkboxexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkBox = findViewById<CheckBox>(R.id.checkBox)

        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) checkBox.text = "checked"
            if(!isChecked) checkBox.text = "unchecked"
        }

    }
}