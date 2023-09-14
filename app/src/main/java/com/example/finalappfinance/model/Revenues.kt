package com.example.finalappfinance.model

data class Revenues(
    val id:String,
    val type_revenue:String,
    val nom_revenue:String,
    val img_revenue: List<String>
)
fun getRevenuess(): List<Revenues> {
    return listOf(
        Revenues(
            id="1",
            type_revenue = "Freelance",
            nom_revenue = "Developpement Web",
            img_revenue = listOf("https://cdn-icons-png.flaticon.com/512/5072/5072860.png")
        ),
        Revenues(
            id="2",
            type_revenue = "Boulot Entreprise",
            nom_revenue = "Developpement Web",
            img_revenue = listOf("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSuyiZ_uiSS09gJWnT-r5MnNPNHn9YEoe96mc7moQPlKg&s")
        ),
        Revenues(
            id="3",
            type_revenue = "Bénéfice d'entreprise",
            nom_revenue = "Projet Professionnel",
            img_revenue = listOf("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSuyiZ_uiSS09gJWnT-r5MnNPNHn9YEoe96mc7moQPlKg&s")
        )

    )}