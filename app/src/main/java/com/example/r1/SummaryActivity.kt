package com.example.r1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SummaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)

        // Obtener los datos de las dos actividades anteriores
        val datoPrimeraActividad = intent.getStringExtra("datoPrimeraActividad")
        val datoSegundaActividad = intent.getStringExtra("datoSegundaActividad")

        // Mostrar el resumen en el TextView
        val textViewSummary = findViewById<TextView>(R.id.textViewSummary)
        textViewSummary.text = "Bienvenido $datoPrimeraActividad.\nTu ciudad es: $datoSegundaActividad"
    }
}
