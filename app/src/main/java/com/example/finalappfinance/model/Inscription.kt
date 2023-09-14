package com.example.finalappfinance.model

data class Inscription(
    val id:String,
    val nom:String,
    val prenom:String,
    val email:String,
    val password:String
)
fun getInscriptions(): List<Inscription> {
    return listOf(
        Inscription(
            id = "1",
            nom="Ishak",
            prenom = "Nesrine",
            email="nesrineissac@gmail.com",
            password="1234"
        ),
        Inscription(
            id = "2",
            nom="Shaiek",
            prenom = "Henny",
            email="Hennysmh@hotmail.com",
            password="Hhenny@123"
        ),
        Inscription(
            id = "3",
            nom="Ishak",
            prenom = "Yosri",
            email="Ishakyosri01@gmail.com",
            password="yosri123"
        ),
        Inscription(
            id = "4",
            nom="Ghiribi",
            prenom = "Monia",
            email="monus216@hotmail.com",
            password="123@monus"
        ),
        Inscription(
            id = "5",
            nom="Ishak",
            prenom = "Nabil",
            email="Nabil012@gmail.com",
            password="nabil@1234/"
        ),

    )}