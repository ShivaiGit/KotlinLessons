package ru.osmanov.kotlinlessons

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.bnt_firstButton)

        button.setOnClickListener {

            val toast = Toast.makeText(applicationContext, "Кнопка работает", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}