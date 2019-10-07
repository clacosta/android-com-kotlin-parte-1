package br.com.alura.financask.model

import java.math.BigDecimal
import java.util.Calendar

class Transacao(
    valor: BigDecimal,
    categoria: String,
    data: Calendar
) {
    private val data = data
    private val categoria = categoria
    private val valor = valor

    fun getValor() : BigDecimal {
        return valor
    }

}