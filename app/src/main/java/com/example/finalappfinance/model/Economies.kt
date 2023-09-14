package com.example.finalappfinance.model

data class Economies(
    val id:String,
    val nom_economies:String,
    val img_categorie_economie:List<String>,
    val solde_economie:String
)

fun getEconomiess(): List<Economies> {
    return listOf(
        Economies(
            id = "Economies 1",
            nom_economies="Santé",
            img_categorie_economie = listOf("https://cdn-icons-png.flaticon.com/512/3767/3767084.png"),
            solde_economie = "200"
        ),
        Economies(
            id = "Economies 2",
            nom_economies="Education",
            img_categorie_economie = listOf("https://cdn-icons-png.flaticon.com/512/3767/3767084.png"),
            solde_economie = "1000"
        ),
        Economies(
            id = "Economies 3",
            nom_economies="Beauté",
            img_categorie_economie = listOf("https://cdn-icons-png.flaticon.com/512/3767/3767084.png"),
            solde_economie = "200"
        ),
        Economies(
            id = "Economies 4",
            nom_economies="Maison",
            img_categorie_economie = listOf("https://cdn-icons-png.flaticon.com/512/3767/3767084.png"),
            solde_economie = "400"
        ),
        Economies(
            id = "Economies 5",
            nom_economies="Voyage",
            img_categorie_economie = listOf("https://cdn-icons-png.flaticon.com/512/3767/3767084.png"),
            solde_economie = "500"
        )

    )
}