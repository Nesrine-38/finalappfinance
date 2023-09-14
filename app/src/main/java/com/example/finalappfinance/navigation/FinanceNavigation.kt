package com.example.finalappfinance.navigation
// cette page pour les routes
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.finalappfinance.navigation.FinanceScreens
import com.example.finalappfinance.screens.home.HomeScreen // home
import com.example.finalappfinance.screens.compte.CompteScreen // compte
import com.example.finalappfinance.screens.profil.ProfilScreen // profil
import com.example.finalappfinance.screens.calendrier.CalendrierScreen // calendrier
import com.example.finalappfinance.screens.login.LoginScreen // loginscreen
import com.example.finalappfinance.screens.revenues.RevenuesScreen // revenues
import com.example.finalappfinance.screens.paiement.PaiementScreen // paiement
import com.example.finalappfinance.screens.depenses.DepensesScreen // depenses
import com.example.finalappfinance.screens.economies.EconomiesScreen // economies
import com.example.finalappfinance.screens.investissements.InvestissementsScreen // economies
import com.example.finalappfinance.screens.inscription.InscriptionScreen // inscription
import com.example.finalappfinance.screens.revenues.RevenuesScreen
import com.example.finalappfinance.screens.paiement.PaiementScreen


@Composable
fun FinanceNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = FinanceScreens.HomeScreen.name){
        composable(FinanceScreens.HomeScreen.name){ // "HomeScreen"
            HomeScreen(navController = navController)
        }
        composable( // compte
            FinanceScreens.CompteScreen.name){
            CompteScreen(navController = navController)
        }
        composable( // profil
            FinanceScreens.ProfilScreen.name){
            ProfilScreen(navController = navController)
        }
        composable( // calendrier
            FinanceScreens.CalendrierScreen.name){
            CalendrierScreen(navController = navController)
        }
        composable( //Depenses
            FinanceScreens.DepensesScreen.name){
            DepensesScreen(navController = navController)
        }
        composable( // economies
            FinanceScreens.EconomiesScreen.name){
            EconomiesScreen(navController = navController)
        }
        composable(
            FinanceScreens.InscriptionScreen.name) {
            InscriptionScreen(navController = navController)
        }
        composable(
            FinanceScreens.LoginScreen.name) {
            LoginScreen(navController = navController)
        }
        composable(
            FinanceScreens.PaiementScreen.name) {
            PaiementScreen(navController = navController)
        }
        composable(
            FinanceScreens.RevenuesScreen.name) {
            RevenuesScreen(navController = navController)
        }

        composable(
            FinanceScreens.InvestissementsScreen.name) {
            InvestissementsScreen(navController = navController)
        }

    }
}
