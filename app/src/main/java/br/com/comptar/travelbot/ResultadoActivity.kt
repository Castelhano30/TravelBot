package br.com.comptar.travelbot

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val resultadoText : TextView = findViewById<TextView>(R.id.textViewResultado)
        val ImageView = findViewById<ImageView>(R.id.imageView5)

        val ImageButton = findViewById<ImageButton>(R.id.imageButton2)
        ImageButton.setOnClickListener{
            val url = "https://www.decolar.com"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }


        if(SharedData.local == 20){
            if(SharedData.clima == 1){

                resultadoText.text = "Salzburgo"
                ImageView.setImageResource(R.drawable.vetor_salzburgo)
            }
            else if(SharedData.clima == 2){

                resultadoText.text = "Cancún"
                ImageView.setImageResource(R.drawable.vetor_cancun)

            }
            else if (SharedData.clima == 3){
                resultadoText.text = "Phuket"
                ImageView.setImageResource(R.drawable.vetor_phuket)
            }
        }
        if(SharedData.local == 10){
            if(SharedData.clima == 1){

                resultadoText.text = "Gramado"
                ImageView.setImageResource(R.drawable.vetor_gramado)
            }
            else if(SharedData.clima == 2){

                resultadoText.text = "Porto de Galinhas"
                ImageView.setImageResource(R.drawable.vetor_porto_de_galinhas)
            }
            else if (SharedData.clima == 3){

                resultadoText.text = "Jericoacoara"
                ImageView.setImageResource(R.drawable.vetor_jericoacoara)
            }
        }

    }


}