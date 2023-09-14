package com.example.finalappfinance.model

data class Paiement(
    val id:String,
    val nom_compte:String,
    val nom_facture:String,
    val img_facture:List<String>,
    val montant_facture:String

)

fun getPaiements(): List<Paiement> {
    return listOf(
        Paiement(
            id = "1",
            nom_compte = "compte_courant",
            nom_facture="facture electricité",
            img_facture = listOf("https://png.pngtree.com/png-vector/20190725/ourlarge/pngtree-invoice-icon-design-vector-png-image_1586820.jpg"),
            montant_facture = "300"
        ),
        Paiement(
            id = "2",
            nom_compte = "compte_courant",
            nom_facture="facture Free",
            img_facture = listOf("https://png.pngtree.com/png-vector/20190725/ourlarge/pngtree-invoice-icon-design-vector-png-image_1586820.jpg"),
            montant_facture = "200"
        ),
        Paiement(
            id="3",
            nom_compte = "compte_courant",
            nom_facture="facture d'eau",
            img_facture = listOf("https://png.pngtree.com/png-vector/20190725/ourlarge/pngtree-invoice-icon-design-vector-png-image_1586820.jpg"),
            montant_facture = "350"
        ),
        Paiement(
            id="4",
            nom_compte = "compte_courant",
            nom_facture ="facture de mobile",
            img_facture = listOf("https://png.pngtree.com/png-vector/20190725/ourlarge/pngtree-invoice-icon-design-vector-png-image_1586820.jpg"),
            montant_facture = "40"
        )
    )}
