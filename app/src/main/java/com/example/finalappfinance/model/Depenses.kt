package com.example.finalappfinance.model

data class Depenses(
    val id:String,
    val budget:String,
    val nom_compte:String,
    val category:List<String>,
    val date: String,
    val commentaire:String
)

fun getDepensess(): List<Depenses> {
    return listOf(
        Depenses(
            id = "depense 1",
            budget = "1000",
            nom_compte = "Nickel",
            date = "2023/09/09 09:00:00",
            commentaire ="Pour acheter les courses",
            category = listOf( "https://cdn-icons-png.flaticon.com/512/135/135763.png",
                "https://cdn-icons-png.flaticon.com/512/1198/1198335.png"
                )

        ),
        Depenses(
            id = "depense 2",
            budget = "1000",
            nom_compte = "compte_courant",
            date = "2023/04/23 10:09:00",
            commentaire ="pour payée le loyer",
            category = listOf(
                "https://static.vecteezy.com/ti/vecteur-libre/p1/14055231-calendrier-de-la-date-d-echeance-du-loyer-maison-icone-de-contour-rempli-vectoriel.jpg",
                "https://c.clc2l.com/t/q/u/quittance-express-hI1EfE.png"
                )
        ),
        Depenses(
            id = "depense 3",
            budget = "1000",
            nom_compte = "compte courant",
            date = "2023/05/10 12:10:46",
            commentaire ="pour faire du shopping",
            category = listOf(
                "https://cdn-icons-png.flaticon.com/512/2331/2331970.png",
                "https://cdn-icons-png.flaticon.com/512/3225/3225194.png"
               )
        ),
        Depenses(
            id = "depense 4",
            budget = "1000",
            nom_compte = "compte courant",
            date = "2023/04/03 10:09:00",
            commentaire ="pour acheter des cadeaux",
            category = listOf(
               "https://cdn-icons-png.flaticon.com/512/214/214305.png",
                "https://static.vecteezy.com/ti/vecteur-libre/p1/1912030-coffrets-cadeaux-icone-cadeau-isole-gratuit-vectoriel.jpg")
    )
    )
}

