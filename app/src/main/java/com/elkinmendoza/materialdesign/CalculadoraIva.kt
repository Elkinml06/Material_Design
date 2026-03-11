package com.elkinmendoza.materialdesign

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true)
@Composable
fun CalculadoraIva(){

    var inputAmmount by remember { mutableStateOf("") }
    var inputPercent by remember { mutableStateOf("") }
    var inputChecked by remember { mutableStateOf(false) }

    val amount = inputAmmount.toDoubleOrNull()?:0.0
    val percent = inputPercent.toDoubleOrNull()?:0.0

    var result = amount * percent / 100
    if (inputChecked) {
        result = kotlin.math.ceil(result)
    }

    Scaffold() { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)
            .padding(40.dp)
            .fillMaxSize()
        ) {
            Text(
                text= "Calculadora impuestos",
                modifier = Modifier
                    .padding(bottom = 16.dp,top=40.dp),
                fontSize = 25.sp,
                color = Color.Red,
            )
            OutlinedTextField(
                value = inputAmmount,
                onValueChange = { inputAmmount = it },
                label = {Text("Cantidad a calcular")},
                modifier = Modifier
                    .fillMaxWidth(),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Decimal
                )
            )
            OutlinedTextField(
                value = inputPercent,
                onValueChange = {inputPercent = it},
                label = {Text("Porcentaje")},
                modifier = Modifier
                    .fillMaxWidth(),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Decimal
                )
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ){
                Text("Redondear")
                Switch(
                    checked = inputChecked,
                    onCheckedChange = { inputChecked = it }
                )

            val num = 5206.9
            val resu = kotlin.math.ceil(num)
            Text( "$resu")

            Text(
                text = "Resultado: $ $result",
                modifier = Modifier
                    .padding(bottom = 16.dp,top=20.dp),
                fontSize = 25.sp
            )
        }

    }
}