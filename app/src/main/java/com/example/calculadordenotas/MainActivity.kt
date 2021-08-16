package com.example.calculadordenotas


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resultado

        btCalcular.setOnClickListener{

            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1+nota2)/2
            val faltas = Integer.parseInt(faltas.text.toString())

            if(media>=6 && faltas <=10){
                resultado.setText("Aluno Aprovado" + "\n" + "Notas Final: " + media + "\n" + "Total de faltas: " + faltas)
                resultado.setTextColor(Color.rgb(3,218,197))

                }
            else{
                resultado.setText("Aluno Reprovado" + "\n" + "Notas Final: " + media + "\n" + "Total de faltas: " + faltas)
                resultado.setTextColor(Color.rgb(228,83,83))

            }
        }
    }
}