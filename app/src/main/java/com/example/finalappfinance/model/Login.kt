package com.example.finalappfinance.model

data class Login(
    val id: String,
    val email: String,
    val password: String
)
fun getLogins(): List<Login> {
    return listOf(
        Login(
            id="1",
            email = "nesrineissac@gmail.com",
            password = "1234"
        ),
        Login(
            id="2",
            email = "Hennysmh@hotmail.com",
            password = "Hhenny@123"
        ),
        Login(
            id="3",
            email = "Ishakyosri01@gmail.com",
            password = "yosri123"
        ),
        Login(
            id="4",
            email = "monus216@hotmail.com",
            password = "123@monus"
        ),
        Login(
            id="5",
            email = "Nabil012@gmail.com",
            password = "nabil@1234/"
        )
    )}
