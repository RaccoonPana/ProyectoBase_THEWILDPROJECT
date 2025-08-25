package com.example.proyectobase

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val btn_Volver:Button = findViewById(R.id.btn_volver)
        val txbienvenida:TextView = findViewById(R.id.tx_bienvenido)
        val ususarioDesdeOtroactivity = intent.getStringExtra("Sesion_usuario")
        val btn_cambiar:Button = findViewById(R.id.btn_cambio)
        txbienvenida.text = ususarioDesdeOtroactivity.toString()

        btn_Volver.setOnClickListener {
        val VolverVentana = Intent(this, MainActivity::class.java)
            startActivity(VolverVentana)
        }
        btn_cambiar.setOnClickListener{
            val cambiarVentana = Intent(this,MainActivity3::class.java)
            startActivity(cambiarVentana)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}