package com.example.finalappfinance.model

data class Compte(
    val id: String,
    val nom_propriete: String,
    val nom_banque: String,
    val type_compte:String,
    val Montant_compte: String,
    val images: List<String>
)

fun getComptes(): List<Compte> {
    return listOf(
        Compte(id = "compte 1",
            nom_propriete = "Nesrine Ishak",
            nom_banque = "Nickel",
            type_compte = "carte bancaire",
            Montant_compte = "500,000",
            images = listOf(
                "https://images-na.ssl-images-amazon.com/images/M/MV5BNzM2MDk3MTcyMV5BMl5BanBnXkFtZTcwNjg0MTUzNA@@._V1_SX1777_CR0,0,1777,999_AL_.jpg",
                "https://png.pngtree.com/element_our/20200702/ourlarge/pngtree-bank-card-icon-image_2292633.jpg")

            ),
        Compte(
            id = "Compte 2 ",
            nom_propriete = "Nesrine Ishak",
            nom_banque = "Société génerale",
            type_compte = "compte courant",
            Montant_compte = "100,000,000",
            images = listOf(
                "https://static.vecteezy.com/ti/vecteur-libre/p3/11268222-compte-courant-plat-grandissime-icone-vectoriel.jpg",
                "https://cdn-icons-png.flaticon.com/512/2132/2132950.png")
        ),
        Compte(
            id ="Compte 3",
            nom_propriete = "Nesrine Ishak",
            nom_banque = "Crédit Agricole",
            type_compte = "compte individuel",
            Montant_compte ="200,000,000",
            images = listOf(
                "https://thumbs.dreamstime.com/z/ic%C3%B4ne-de-compte-individuel-comptabilit%C3%A9-simple-monochrome-pour-mod%C3%A8les-conception-web-et-infographisme-symbole-comptabilisation-246095071.jpg")
        ),
        Compte(
            id ="Compte 4",
            nom_propriete = "Nesrine Ishak",
            nom_banque = "Hello Bank!",
            type_compte = "compte épargne",
            Montant_compte ="100,000,000",
            images = listOf(
                "https://cdn.icon-icons.com/icons2/2809/PNG/512/money_savings_save_icon_179034.png",
             "https://cdn.icon-icons.com/icons2/3008/PNG/512/savings_piggy_bank_money_icon_188471.png")
        )
    )
}
