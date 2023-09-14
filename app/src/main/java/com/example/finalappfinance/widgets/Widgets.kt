package com.example.finalappfinance.widgets


import androidx.compose.animation.AnimatedVisibility

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.finalappfinance.model.Compte
import com.example.finalappfinance.model.getComptes

@Preview
@Composable
fun CompteRow(compte: Compte = getComptes()[0], onItemClick: (String) -> Unit = {}) {

    var expanded by remember {
        mutableStateOf(false)
    }

    Card(modifier = Modifier
        .padding(1.dp)
        .fillMaxWidth()

        .clickable {
            onItemClick(compte.id)
        },
        shape = RoundedCornerShape(corner = CornerSize(8.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 3.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Surface (modifier = Modifier
                .padding(8.dp)
                .size(50.dp),
                shape = RectangleShape,
                shadowElevation = 4.dp,
            ) {

                AsyncImage(
                    model = compte.images[0],
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                )

                /*Image(painter = rememberImagePainter(data = movie.images[0]),
                    contentDescription = "Poster")*/
            }

            Column(modifier = Modifier.padding(3.dp)) {
                Text(text = compte.nom_banque,
                    style = MaterialTheme.typography.headlineSmall)
                Text(text = "  ${compte.type_compte}",
                    style = MaterialTheme.typography.labelMedium)
                Text(text = " Montant:${compte.Montant_compte}",
                    style = MaterialTheme.typography.labelMedium)
            }
        }

    }
}