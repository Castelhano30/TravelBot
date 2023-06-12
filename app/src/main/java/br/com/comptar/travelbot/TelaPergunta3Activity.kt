package br.com.comptar.travelbot

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TelaPergunta3Activity : AppCompatActivity() {

    //Criando cor para o botão desabilitado
    val cor_cinza_btn_desabilitado = Color.rgb(128,128,128)
    //Criando cor para o botão habilitado
    val cor_verde_btn_habilitado = Color.rgb(255,124,124)

    private lateinit var btnConfirmarResp : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pergunta3)

        val btnResp1: Button = findViewById(R.id.buttonResp1)
        btnResp1.setOnClickListener {
            btnResp1.setBackgroundColor(Color.rgb(137, 137, 137))
            btnResp1.setTextColor(Color.WHITE)
            HabiltarButtonConfirmarResposta()
        }

        val btnResp2: Button = findViewById(R.id.buttonResp2)
        btnResp2.setOnClickListener {
            btnResp2.setBackgroundColor(Color.rgb(137, 137, 137))
            btnResp2.setTextColor(Color.WHITE)
            HabiltarButtonConfirmarResposta()
        }

        val btnResp3: Button = findViewById(R.id.buttonResp3)
        btnResp3.setOnClickListener {
            btnResp3.setBackgroundColor(Color.rgb(137, 137, 137))
            btnResp3.setTextColor(Color.WHITE)
            HabiltarButtonConfirmarResposta()
        }

        val btnResp4: Button = findViewById(R.id.buttonResp4)
        btnResp4.setOnClickListener {
            btnResp4.setBackgroundColor(Color.rgb(224, 17, 95))
            btnResp4.setTextColor(Color.WHITE)
            HabiltarButtonConfirmarResposta()
        }

        btnConfirmarResp = findViewById<Button>(R.id.buttonConfirmquestion)
        btnConfirmarResp.setOnClickListener {
            val intent = Intent(this@TelaPergunta3Activity,TelaPergunta4Activity::class.java)
            startActivity(intent)
            HabiltarButtonConfirmarResposta()
        }
        DesabilitarButtonConfirmarRespoasta()
    }

    private fun HabiltarButtonConfirmarResposta() {
        btnConfirmarResp.setTextColor(Color.WHITE)
        btnConfirmarResp.setBackgroundColor(cor_verde_btn_habilitado)
        btnConfirmarResp.isEnabled = true
    }
    private fun DesabilitarButtonConfirmarRespoasta() {
        btnConfirmarResp.setTextColor(Color.WHITE)
        btnConfirmarResp.setBackgroundColor(cor_cinza_btn_desabilitado)
        btnConfirmarResp.isEnabled = false
    }
}