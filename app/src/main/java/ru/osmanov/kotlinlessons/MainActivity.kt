package ru.osmanov.kotlinlessons

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.bnt_firstButton)
        val tvLocality: TextView = findViewById(R.id.tv_locality)
        val tvTypeOfWeather: TextView = findViewById(R.id.tv_typeOfWeather)
        val tvTemperature: TextView = findViewById(R.id.tv_temperature)

        val weather1 = Weather ("Москва", TypesOfWeather.SUNNY, 5)
        val weather2 = weather1.copy(typeOfWeather = TypesOfWeather.RAIN, temperature = 12)

        button.setOnClickListener {

            val toast = Toast.makeText(applicationContext, "Кнопка работает", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}