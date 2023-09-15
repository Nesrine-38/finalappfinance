package com.example.finalappfinance.screens.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.finalappfinance.navigation.FinanceScreens
import com.example.finalappfinance.ui.theme.Pink80



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController = NavController(LocalContext.current)){
    Scaffold(
        topBar={
            CenterAlignedTopAppBar(
                title = { Text("Vous êtes la bienvenue !",
                    fontFamily = FontFamily.Cursive,
                        fontSize = 30.sp
                    )
                 },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    titleContentColor = Pink80
                ))
        },
        bottomBar =
        {
            NavigationBar {
                NavigationBarItem(
                    selected = true,
                    onClick = { navController.navigate(FinanceScreens.HomeScreen.name) },
                    icon = { Icon(imageVector = Icons.Default.Home, contentDescription = "Home") },
                    label = { Text(text = "Home") }
                )

                NavigationBarItem(
                    selected = true,
                    onClick = { navController.navigate(FinanceScreens.CalendrierScreen.name) },
                    icon = { Icon(imageVector = Icons.Default.DateRange, contentDescription = "date") },
                    label = { Text(text = "Calendrier") }
                )
                NavigationBarItem(
                    selected = true,
                    onClick = { navController.navigate(FinanceScreens.ProfilScreen.name) },
                    icon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person") },
                    label = { Text(text = "Profile") }
                )

            }
        }
    )
    { paddingValues ->
        Surface(modifier = Modifier.padding(paddingValues)){
                Text(text = "La vie n'est pas ce qu'on pense, mais ce qu'on dépense",
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    color = Color.Red ,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 70.dp),
                )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Button(
                    onClick = {navController.navigate(FinanceScreens.CompteScreen.name) },
                    border = BorderStroke(1.dp, Color(0xFFE9B005)),
                    shape = RoundedCornerShape(50),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    content = { Text("Comptes",
                        fontWeight = FontWeight.Bold) },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Blue,
                        containerColor = Color.White
                    )
                )

                Button(
                    onClick = {navController.navigate(FinanceScreens.DepensesScreen.name) },
                    border = BorderStroke(1.dp, Color(0xFFE9B005)),
                    shape = RoundedCornerShape(50),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    content = { Text("Depenses",
                        fontWeight = FontWeight.Bold) },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Blue,
                        containerColor = Color.White
                    )
                )
                Button(
                    onClick = {navController.navigate(FinanceScreens.PaiementScreen.name) },
                    border = BorderStroke(1.dp, Color(0xFFE9B005)),
                    shape = RoundedCornerShape(50),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    content = { Text("Paiement",
                        fontWeight = FontWeight.Bold)},
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Blue,
                        containerColor = Color.White
                    )
                )
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    onClick = {navController.navigate(FinanceScreens.RevenuesScreen.name) },
                    border = BorderStroke(1.dp, Color(0xFFE9B005)),
                    shape = RoundedCornerShape(50),
                    content = { Text("Revenues",
                        fontWeight = FontWeight.Bold)},
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Blue,
                        containerColor = Color.White
                    )
                )

                Button(
                    onClick = {navController.navigate(FinanceScreens.EconomiesScreen.name) },
                    border = BorderStroke(1.dp, Color(0xFFE9B005)),
                    shape = RoundedCornerShape(50),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    content = { Text("Les Economies",
                        fontWeight = FontWeight.Bold) },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Blue,
                        containerColor = Color.White
                    )
                )
                Button(
                    onClick = {navController.navigate(FinanceScreens.InvestissementsScreen.name) },
                    border = BorderStroke(1.dp, Color(0xFFE9B005)),
                    shape = RoundedCornerShape(50),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp),
                    content = { Text(" Les investissements",
                        fontWeight = FontWeight.Bold) },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.Blue,
                        containerColor = Color.White
                    )
                )
            }
        }
    }
}

@Composable
fun MainContent(navController: NavController)
{
}




