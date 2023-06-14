package br.com.comptar.travelbot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val resultadoText : TextView = findViewById<TextView>(R.id.textViewResultado)
        if(SharedData.local == 20){
            if(SharedData.clima == 1){

                resultadoText.text = "Salzburgo"
            }
            else if(SharedData.clima == 2){

                resultadoText.text = "Cancún"

            }
            else if (SharedData.clima == 3){
                resultadoText.text = "Phuket"
            }
        }
        if(SharedData.local == 10){
            if(SharedData.clima == 1){

                resultadoText.text = "Gramado"
            }
            else if(SharedData.clima == 2){

                resultadoText.text = "Porto de Galinhas"
            }
            else if (SharedData.clima == 3){

                resultadoText.text = "Jericoacoara"
            }
        }

    }


}