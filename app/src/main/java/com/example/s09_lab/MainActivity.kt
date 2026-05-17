package com.example.s09_lab

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var reporteTrabajadores = ""

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtApellidos = findViewById<EditText>(R.id.txtApellidos)
        val txtNombres = findViewById<EditText>(R.id.txtNombres)
        val txtSueldo = findViewById<EditText>(R.id.txtSueldo)

        val rbMasculino = findViewById<RadioButton>(R.id.rbMasculino)
        val rbAFP = findViewById<RadioButton>(R.id.rbAFP)

        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        val btnMostrar = findViewById<Button>(R.id.btnMostrar)

        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        btnAgregar.setOnClickListener {

            val apellidos = txtApellidos.text.toString()
            val nombres = txtNombres.text.toString()

            val sueldoBasico =
                txtSueldo.text.toString().toDoubleOrNull()

            if (apellidos.isEmpty() ||
                nombres.isEmpty() ||
                sueldoBasico == null
            ) {

                txtResultado.text =
                    "Completa todos los campos correctamente"

                return@setOnClickListener
            }

            val genero =
                if (rbMasculino.isChecked)
                    "Masculino"
                else
                    "Femenino"

            val tipoSeguro: String
            val descuento: Double

            if (rbAFP.isChecked) {

                tipoSeguro = "AFP"
                descuento = sueldoBasico * 0.125

            } else {

                tipoSeguro = "ONP"
                descuento = sueldoBasico * 0.08
            }

            val sueldoNeto = sueldoBasico - descuento

            reporteTrabajadores += """

                -------------------------

                Apellidos: $apellidos

                Nombres: $nombres

                Género: $genero

                Seguro: $tipoSeguro

                Sueldo básico: S/ %.2f

                Descuento: S/ %.2f

                Sueldo neto: S/ %.2f

            """.trimIndent().format(
                sueldoBasico,
                descuento,
                sueldoNeto
            )

            txtApellidos.text.clear()
            txtNombres.text.clear()
            txtSueldo.text.clear()
        }

        btnMostrar.setOnClickListener {

            if (reporteTrabajadores.isEmpty()) {

                txtResultado.text =
                    "No hay trabajadores registrados"

            } else {

                txtResultado.text = reporteTrabajadores
            }
        }
    }
}