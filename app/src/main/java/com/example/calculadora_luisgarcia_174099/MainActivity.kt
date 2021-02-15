package com.example.calculadora_luisgarcia_174099

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val resultado: TextView = (findViewById(R.id.output)) as TextView
    val entrada: TextView = (findViewById(R.id.input)) as TextView
    val boton0: Button = (findViewById(R.id.boton0)) as Button
    val boton1: Button = (findViewById(R.id.boton1)) as Button
    val boton2: Button = (findViewById(R.id.boton2)) as Button
    val boton3: Button = (findViewById(R.id.boton3)) as Button
    val boton4: Button = (findViewById(R.id.boton4)) as Button
    val boton5: Button = (findViewById(R.id.boton5)) as Button
    val boton6: Button = (findViewById(R.id.boton6)) as Button
    val boton7: Button = (findViewById(R.id.boton7)) as Button
    val boton8: Button = (findViewById(R.id.boton8)) as Button
    val boton9: Button = (findViewById(R.id.boton9)) as Button
    val botonMas: Button = (findViewById(R.id.botonMas)) as Button
    val botonMenos: Button = (findViewById(R.id.botonMenos)) as Button
    val botonPor: Button = (findViewById(R.id.botonPor)) as Button
    val botonEntre: Button = (findViewById(R.id.botonEntre)) as Button
    val botonResult: Button = (findViewById(R.id.botonResult)) as Button
    val botonBorrar: Button = (findViewById(R.id.botonBorrar)) as Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton0.setOnClickListener {
            if (!(entrada.text == "0")) {
                entrada.setText("" + entrada.text + 0)
            }
        }

        boton1.setOnClickListener {
            if (entrada.text == "0") {
                entrada.setText("1")
            } else {
                entrada.setText("" + entrada.text + 1)
            }
        }

        boton2.setOnClickListener {
            if (entrada.text == "0") {
                entrada.setText("2")
            } else {
                entrada.setText("" + entrada.text + 2)
            }
        }

        /*fun devolverOperacion(): String {
            return resultado.text[resultado.text.length-1].toString()
        }*/
    }
}