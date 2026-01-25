package com.example.thedreamteamapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,   // ✅ center vertically
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Dream Team App",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Choose a member bio",
            style = MaterialTheme.typography.bodyMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.navigate("AnilasScreen") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Marc Denzel Anilas Bio")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { navController.navigate("ApuradoScreen") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Marc Andrei Apurado Bio")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { navController.navigate("ArcojeresScreen") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Veronica Arcojeres Bio")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { navController.navigate("AsiScreen") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Jaspher Cedrick Nolo Asi Bio")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { navController.navigate("AsiloScreen") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Kent Justine Asilo Bio")
        }
    }
}
