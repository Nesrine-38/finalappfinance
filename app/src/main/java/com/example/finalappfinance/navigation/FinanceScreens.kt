package com.example.finalappfinance.navigation

import java.lang.IllegalArgumentException
// on mentionne tous les pages de notre projet
enum class FinanceScreens {
    HomeScreen, // => 0
    CalendrierScreen,
    CompteScreen,
    DepensesScreen,
    EconomiesScreen,
    InscriptionScreen,
    LoginScreen,
    PaiementScreen,
    ProfilScreen,
    InvestissementsScreen,
    RevenuesScreen; // => 1
    companion object { // block statics
        fun fromRoute(route: String?): FinanceScreens
                = when(route?.substringBefore("/")){
            HomeScreen.name -> HomeScreen
            CalendrierScreen.name -> CalendrierScreen
            CompteScreen.name -> CompteScreen
            DepensesScreen.name -> DepensesScreen
            EconomiesScreen.name ->EconomiesScreen
            InscriptionScreen.name -> InscriptionScreen
            LoginScreen.name -> LoginScreen
            PaiementScreen.name -> PaiementScreen
            ProfilScreen.name -> ProfilScreen
            RevenuesScreen.name -> RevenuesScreen
            InvestissementsScreen.name -> InvestissementsScreen
                null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognised")
        }
    }

}