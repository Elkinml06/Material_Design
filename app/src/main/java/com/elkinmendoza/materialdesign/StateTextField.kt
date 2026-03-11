package com.elkinmendoza.materialdesign

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun StateTextField (){
    var inputUser by remember { mutableStateOf("Elkin") }
    Scaffold() {innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
        ) {
            TextField(
                value = inputUser,
                onValueChange = { it ->
                    inputUser = it

                },
                label = {
                    Text("Escribe algo")
                }
            )
            Text( fontSize = 35.sp, text = "El usuario escribio:" )
            Text( fontSize = 35.sp, text = inputUser )
        }
    }

}