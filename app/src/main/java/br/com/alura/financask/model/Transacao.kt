package br.com.alura.financask.model

import java.math.BigDecimal
import java.util.Calendar

class Transacao(
    var valor: BigDecimal,
    var categoria: String,
    var data: Calendar
) 