package com.example.finalappfinance.screens.depenses

import android.service.autofill.OnClickAction
import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.Calendar
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.finalappfinance.R
import com.example.finalappfinance.model.getDepensess
import com.example.finalappfinance.navigation.FinanceScreens
import com.example.finalappfinance.ui.theme.Pink80
import com.maxkeppeker.sheets.core.models.base.rememberSheetState
import com.maxkeppeler.sheets.calendar.CalendarDialog
import com.maxkeppeler.sheets.calendar.models.CalendarConfig
import com.maxkeppeler.sheets.calendar.models.CalendarSelection
import com.maxkeppeler.sheets.calendar.models.CalendarStyle
import com.maxkeppeler.sheets.clock.ClockDialog
import com.maxkeppeler.sheets.clock.models.ClockConfig
import com.maxkeppeler.sheets.clock.models.ClockSelection
import java.time.LocalDate
import java.util.Date


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DepensesScreen(navController: NavController) {
    var commentText by remember { mutableStateOf("") }
    var isIconSelected by remember { mutableStateOf(false) }
    var text by remember { mutableStateOf("") }
    val calendarState = rememberSheetState()


    CalendarDialog(
        state = calendarState,
        config = CalendarConfig(
            monthSelection = true,
            yearSelection = true,
            style = CalendarStyle.WEEK,
            disabledDates = listOf(LocalDate.now().plusDays(7))
        ),
        selection = CalendarSelection.Date {
        date ->  Log.d("SelectedDate", "$date")
    })

    val clockState= rememberSheetState()

    ClockDialog(
        state = clockState,
        config = ClockConfig(
            is24HourFormat = false
        ),
        selection = ClockSelection.HoursMinutes {
            hours, minutes ->
            Log.d("SelectedDate", "$hours:$minutes")
        })


    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Depenses",
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
                    ) { Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Retour") }
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
                    icon = {
                        Icon(
                            imageVector = Icons.Default.DateRange,
                            contentDescription = "date"
                        )
                    },
                    label = { Text(text = "Calendrier") }
                )
                NavigationBarItem(
                    selected = true,
                    onClick = { navController.navigate(FinanceScreens.ProfilScreen.name) },
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Person"
                        )
                    },
                    label = { Text(text = "Profile") }
                )

            }
        }
    )
    { paddingValues ->
        Surface(modifier = Modifier.padding(paddingValues)) {
            Column (
                modifier = Modifier
                    .fillMaxSize()


            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(7.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                )
                {Text(
                    text = ("Budget:  " + getDepensess()[0].budget + "€"),
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    color = Color.Red,


                )}
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ){
                    Text(
                        text = ("Nom de Compte:  " + getDepensess()[0].nom_compte),
                        fontFamily = FontFamily.Monospace,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        color = Color.Red

                    )}
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                   ){
                    Text(
                        text = ("Categories"),
                        fontFamily = FontFamily.Cursive,
                        fontSize = 30.sp,
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Bold,
                        color = Color.Blue
                    )}

                Column (

                    modifier = Modifier
                        .fillMaxWidth()
                ){

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp),

                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    )
                    {

                        Icon(

                            painter = painterResource(R.mipmap.home_foreground),
                            contentDescription = "Home",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable {
                                    isIconSelected = !isIconSelected
                                }
                                .background(if (isIconSelected) Color.Green else Color.Transparent),
                        )

                        Icon(
                            painter = painterResource(R.mipmap.courses_foreground),
                            contentDescription = "courses",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable {
                                    isIconSelected = !isIconSelected
                                }
                                .background(if (isIconSelected) Color.Green else Color.Transparent),
                        )


                        Icon(
                            painter = painterResource(R.mipmap.sante_foreground),
                            contentDescription = "courses",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable {
                                    isIconSelected = !isIconSelected
                                }
                                .background(if (isIconSelected) Color.Green else Color.Transparent),
                        )



                        Icon(
                            painter = painterResource(R.mipmap.car_foreground),
                            contentDescription = "courses",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable {
                                    isIconSelected = !isIconSelected
                                }
                                .background(if (isIconSelected) Color.Green else Color.Transparent),
                        )

                    }
                    Spacer(Modifier.height(20.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Icon(
                            painter = painterResource(R.mipmap.cadeau_foreground),
                            contentDescription = "courses",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable {
                                    isIconSelected = !isIconSelected
                                }
                                .background(if (isIconSelected) Color.Green else Color.Transparent),
                        )

                        Icon(
                            painter = painterResource(R.mipmap.shoping_foreground),
                            contentDescription = "courses",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable {
                                    isIconSelected = !isIconSelected
                                }
                                .background(if (isIconSelected) Color.Green else Color.Transparent),
                        )
                        Icon(
                            painter = painterResource(R.mipmap.cat_foreground),
                            contentDescription = "courses",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable {
                                    isIconSelected = !isIconSelected
                                }
                                .background(if (isIconSelected) Color.Green else Color.Transparent),
                        )
                        Icon(
                            painter = painterResource(R.mipmap.ajouter_foreground),
                            contentDescription = "courses",
                            modifier = Modifier
                                .size(40.dp)
                                .clickable {
                                    isIconSelected = !isIconSelected
                                }
                                .background(if (isIconSelected) Color.Green else Color.Transparent),
                        )
                    }

                    Column (){
                        Row (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(40.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ){
                            Button(onClick = { calendarState.show() },
                                border = BorderStroke(1.dp, Color(0xFFE9B005)),
                                colors = ButtonDefaults.buttonColors(
                                    contentColor = Color.Blue,
                                    containerColor = Color.White
                                ))
                            {
                                Text(text = "Date Picker")
                            }

                            Spacer(Modifier.width(6.dp))
                            Button(onClick = {  clockState.show()  },
                                border = BorderStroke(1.dp, Color(0xFFE9B005)),
                                colors = ButtonDefaults.buttonColors(
                                    contentColor = Color.Blue,
                                    containerColor = Color.White)) {
                                Text(text = "Time Picker")
                            }
                        }

                        }

                    Column(
                        modifier = Modifier
                        .padding(horizontal = 20.dp),
                    ) {
                                Text(
                                    text = "Commentaire",
                                    fontFamily = FontFamily.Cursive,
                                    fontSize = 30.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Blue
                                )
                                Spacer(modifier = Modifier.height(16.dp))

                        Icon(
                            imageVector = Icons.Default.Send,
                            contentDescription = "Envoyer",
                            tint = Color.Blue,
                            modifier = Modifier
                                .size(24.dp)
                                .padding(end = 8.dp)
                                .clickable {

                                }

                        )

                                TextField(
                                    value = text,
                                    onValueChange = { newText ->
                                        text = newText
                                    },
                                    label = { Text("Enter text") },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .background(Color.White),

                                )
                        }

                    }
                }

            }
    }
}



@Composable
fun MainContent(navController: NavController)
{
}