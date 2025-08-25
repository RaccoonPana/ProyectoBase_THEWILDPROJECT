package com.example.proyectobase

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        val edNombreAct: EditText = findViewById(R.id.ed_nombre_act3)
        val edApell: EditText = findViewById(R.id.ed_apell_act3)
        val edFnac: EditText = findViewById(R.id.ed_fech_act3)
        val btn_Volver_act3: Button = findViewById(R.id.btn_volver_act3)
        val btn_Guardado:Button=findViewById(R.id.btn_guardar)
        btn_Volver_act3.setOnClickListener {
            val VolverVentana = Intent(this, MainActivity::class.java)
            startActivity(VolverVentana)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}