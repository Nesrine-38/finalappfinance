package com.example.finalappfinance.model

data class Investissement(
    val id: String,
    val nom_investissement: String,
    val montant: String
)

fun getInvestissements(): List<Investissement> {
    return listOf(
        Investissement(id = "investissement 1",
            nom_investissement = "soin visage",
            montant= "500"
        ),
        Investissement(
            id = "investissement 2",
            nom_investissement = "montres",
            montant = "1000"
        ),
        Investissement(
            id = "investissement 3",
            nom_investissement = "maquillage",
            montant = "600"
        )
    )
}
