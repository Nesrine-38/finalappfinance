package com.example.finalappfinance.model

data class Profil(
    val id: String,
    val nom_utilisateur: String,
    val Nom_banque: List<String>,
    val bio:String
)
fun getProfils(): List<Profil> {
    return listOf(
       Profil(
           id="1",
           nom_utilisateur = "Nesrine38",
           Nom_banque = listOf("Nickel", "Hello Bank!", "Société génerale", "Crédit Agricole"),
           bio = "n'importe quoi"
       ),
        Profil(
            id="2",
            nom_utilisateur = "Henny038",
            Nom_banque = listOf("Nickel", "Hello Bank!", "Société génerale", "Crédit Agricole"),
            bio = "n'importe quoi"
        ),
        Profil(
            id="3",
            nom_utilisateur = "yosri216",
            Nom_banque = listOf("Nickel", "Hello Bank!", "Société génerale", "Crédit Agricole"),
            bio = "n'importe quoi"
        ),
        Profil(
            id="4",
            nom_utilisateur = "Monia_ghi",
            Nom_banque = listOf("Nickel", "Hello Bank!", "Société génerale", "Crédit Agricole"),
            bio = "n'importe quoi"
        ),
        Profil(
            id="5",
            nom_utilisateur = "nabil_ISH",
            Nom_banque = listOf("Nickel", "Hello Bank!", "Société génerale", "Crédit Agricole"),
            bio = "n'importe quoi"
        )
    )}
