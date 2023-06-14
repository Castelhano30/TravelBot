package br.com.comptar.travelbot

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class TelaPergunta2Activity : AppCompatActivity() {

    //Criando cor para o botão desabilitado
    val cor_cinza_btn_desabilitado = Color.rgb(128,128,128)
    //Criando cor para o botão habilitado
    val cor_verde_btn_habilitado = Color.rgb(255,124,124)


    private lateinit var btnConfirmarResp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pergunta2)

        val btnResp1: Button = findViewById(R.id.buttonResp1)
        btnResp1.setOnClickListener {
            btnResp1.setBackgroundColor(Color.rgb(137, 137, 137))
            btnResp1.setTextColor(Color.WHITE)
            SharedData.local = 10
            HabiltarButtonConfirmarResposta()
        }

        val btnResp2: Button = findViewById(R.id.buttonResp2)
        btnResp2.setOnClickListener {
            btnResp2.setBackgroundColor(Color.rgb(137, 137, 137))
            btnResp2.setTextColor(Color.WHITE)
            SharedData.local = 20
            HabiltarButtonConfirmarResposta()
        }

        btnConfirmarResp = findViewById<Button>(R.id.buttonConfirmquestion)
        btnConfirmarResp.setOnClickListener {
            val intent = Intent(this@TelaPergunta2Activity,TelaPergunta3Activity::class.java)
            startActivity(intent)
            HabiltarButtonConfirmarResposta()
        }

        DesabilitarButtonConfirmarResposta()
    }

    private fun HabiltarButtonConfirmarResposta() {
        btnConfirmarResp.setTextColor(Color.WHITE)
        btnConfirmarResp.setBackgroundColor(cor_verde_btn_habilitado)
        btnConfirmarResp.isEnabled = true
    }
    private fun DesabilitarButtonConfirmarResposta() {
        btnConfirmarResp.setTextColor(Color.WHITE)
        btnConfirmarResp.setBackgroundColor(cor_cinza_btn_desabilitado)
        btnConfirmarResp.isEnabled = false
    }
}