package com.example.finalappfinance.screens.compte

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import com.example.finalappfinance.model.Compte
import com.example.finalappfinance.model.getComptes
import com.example.finalappfinance.navigation.FinanceScreens
import com.example.finalappfinance.widgets.CompteRow
import com.example.finalappfinance.ui.theme.Pink80

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CompteScreen(navController: NavController){
    val comptes = getComptes()
    var showDialog by remember { mutableStateOf(false) }
    var itemName by remember { mutableStateOf("") }
    var itemDescription by remember { mutableStateOf("") }
    var itemMontant by remember { mutableStateOf("") }
    Scaffold(
        topBar={
            CenterAlignedTopAppBar(
                title = { Text("Comptes",
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
        Surface(modifier = Modifier.padding(paddingValues)) {
            MainContent(navController = navController)
        }
        Column (
            modifier = Modifier
                .padding(top = 400.dp)
        ){
            Button(
                onClick = {showDialog = true },
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
                                value = itemName,
                                onValueChange = {
                                    itemName = it
                                },
                                modifier = Modifier
                                    .fillMaxWidth(),
                                label = {
                                    Text("nom banque")
                                }
                            )

                            OutlinedTextField(
                                value = itemDescription,
                                onValueChange = {
                                    itemDescription = it
                                },
                                modifier = Modifier
                                    .fillMaxWidth(),
                                label = {
                                    Text("type compte")
                                }
                            )

                            OutlinedTextField(
                                value = itemMontant,
                                onValueChange = {
                                    itemMontant = it
                                },
                                modifier = Modifier
                                    .fillMaxWidth(),
                                label = {
                                    Text("Montant compte")
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
                                    // Ajoutez l'élément à votre liste ou effectuez l'action souhaitée
                                    addItem(itemName, itemDescription,)
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
fun addItem(name: String, description: String) {

}

@Composable
fun MainContent(
    navController: NavController,
    comptesList: List<Compte> = getComptes())
{
    Column (modifier = Modifier
        .padding(30.dp)) {
        LazyColumn {
            items(items = comptesList){
                CompteRow(compte = it) { compte ->
                    navController.navigate(route = FinanceScreens.HomeScreen.name)
                }
            }
        }
    }
}

