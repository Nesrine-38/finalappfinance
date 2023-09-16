package com.example.finalappfinance.screens.paiement

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.finalappfinance.R
import com.example.finalappfinance.model.getPaiements
import com.example.finalappfinance.navigation.FinanceScreens
import com.example.finalappfinance.screens.economies.addItem
import com.example.finalappfinance.ui.theme.Pink80

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PaiementScreen(navController: NavController){
    var showDialog by remember { mutableStateOf(false) }
    var itemnom_facture by remember { mutableStateOf("") }
    var itemmontant_facture by remember { mutableStateOf("") }
   Scaffold(
        topBar={
            CenterAlignedTopAppBar(
                title = { Text("Les Paiements",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 30.sp
                )
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    titleContentColor = Pink80
                ),
                navigationIcon = {
                    IconButton(
                        onClick = { navController.navigate(FinanceScreens.HomeScreen.name) }
                    ) {Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Retour")}
                }
            )
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

        Column (  modifier = Modifier
            .padding(16.dp))
        {
            Text(text = "Compte de paiement :",
                fontWeight = FontWeight.Bold)
            Text(text = (getPaiements()[0].nom_compte) ,
                color = Color.Red
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start

            ){
                Icon(painter = painterResource(R.mipmap.facture_foreground),
                    contentDescription = "Facture", Modifier.width(70.dp))
                Text(text = (getPaiements()[0].nom_facture),
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue)
                Text(text = ":",
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue)
                Spacer(Modifier.width(4.dp))
                Text(text =  (getPaiements()[0].montant_facture))
                Text(text =  "€")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start

            ){
                Icon(painter = painterResource(R.mipmap.facture_foreground),
                    contentDescription = "facture", Modifier.width(70.dp))
                Text(text = (getPaiements()[1].nom_facture),
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue)
                Text(text = ":",
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue)
                Spacer(Modifier.width(4.dp))
                Text(text =  (getPaiements()[1].montant_facture))
                Text(text =  "€")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start

            ){
                Icon(painter = painterResource(R.mipmap.facture_foreground),
                    contentDescription = "facture", Modifier.width(70.dp))
                Text(text = (getPaiements()[2].nom_facture),
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue)
                Text(text = ":",
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue)
                Spacer(Modifier.width(4.dp))
                Text(text =  (getPaiements()[2].montant_facture))
                Text(text =  "€")

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Start

            ){
                Icon(painter = painterResource(R.mipmap.facture_foreground),
                    contentDescription = "facture", Modifier.width(70.dp))
                Text(text = (getPaiements()[3].nom_facture),
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue)
                Text(text = ":",
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue)
                Spacer(Modifier.width(4.dp))
                Text(text =  (getPaiements()[3].montant_facture))
                Text(text =  "€")
            }

            Button(
                onClick = {navController.navigate(FinanceScreens.CompteScreen.name) },
                border = BorderStroke(1.dp, Color(0xFFE9B005)),
                shape = RoundedCornerShape(50),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(50.dp),
                content = { Text("Add", fontWeight = FontWeight.Bold,
                    color = Color(0xFFE9B005))},
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Blue,
                    containerColor = Color.White
                )
            )

            if (showDialog) {
                AlertDialog(
                    onDismissRequest = {
                        showDialog = false
                    },
                    title = {
                        Text(text = "Ajouter un nouvel élément")
                    },
                    text = {
                        Column {
                            OutlinedTextField(
                                value = itemnom_facture,
                                onValueChange = {
                                    itemnom_facture = it
                                },
                                modifier = Modifier
                                    .fillMaxWidth(),
                                label = {
                                    Text("Nom facture")
                                }
                            )

                            OutlinedTextField(
                                value = itemmontant_facture,
                                onValueChange = {
                                    itemmontant_facture = it
                                },
                                modifier = Modifier
                                    .fillMaxWidth(),
                                label = {
                                    Text("montant facture")
                                }
                            )
                        }
                    },
                    confirmButton = {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Button(
                                onClick = {
                                    addItem(itemnom_facture, itemmontant_facture,)
                                    showDialog = false
                                }
                            ) {
                                Text(text = "Ajouter")
                            }

                            Button(
                                onClick = {
                                    showDialog = false
                                }
                            ) {
                                Text(text = "Annuler")
                            }
                        }
                    }
                )
            }
        }
    }
}
}

fun addItem(name: String, description: String) {

}
@Composable
fun MainContent(navController: NavController)
{
}