package br.com.alura.financask.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.alura.financask.R
import br.com.alura.financask.model.Transacao
import br.com.alura.financask.ui.adapter.ListaTrasacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)
        val transacoes = listOf(
            Transacao(
                BigDecimal(20.5),
                "Comida",
                Calendar.getInstance()
            ),
            Transacao(
                BigDecimal(100.0),
                "Economia",
                Calendar.getInstance()
            )
        )
        lista_transacoes_listview.adapter = ListaTrasacoesAdapter(this, transacoes)
    }

}