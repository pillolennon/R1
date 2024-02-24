package com.example.r1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val editTextSecond = findViewById<EditText>(R.id.editTextSecond)
        val buttonSecond = findViewById<Button>(R.id.buttonSecond)

        // Obtener el dato de la primera actividad
        val datoPrimeraActividad = intent.getStringExtra("dato")

        buttonSecond.setOnClickListener {
            val datoSegundaActividad = editTextSecond.text.toString()
            val intent = Intent(this, SummaryActivity::class.java)
            intent.putExtra("datoPrimeraActividad", datoPrimeraActividad)
            intent.putExtra("datoSegundaActividad", datoSegundaActividad)
            startActivity(intent)
        }
    }
}
