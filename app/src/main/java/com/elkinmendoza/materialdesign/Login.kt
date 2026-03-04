package com.elkinmendoza.materialdesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons

import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Search

import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Login()
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun Login (){
    Scaffold(){ innerPadding ->
        Column( modifier = Modifier.padding(innerPadding).padding(32.dp,0.dp)) {
            Content()

        }
    }
}

@Composable
fun Content() {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Logo",
            modifier = Modifier
                .size(200.dp)
        )
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = "Iniciar Sesión",
            fontWeight = FontWeight.Bold,
            fontSize = (28.sp),
            color = Color(241,169,60)
        )
        Spacer(modifier = Modifier.height(24.dp))


        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text("Correo Electrónico")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = null)
            },
            shape = RoundedCornerShape(16.dp)

        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text("Contraseña")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock, contentDescription = null)
            },
            shape = RoundedCornerShape(16.dp)
        )

        Spacer(modifier = Modifier.height(26.dp))
        Text(
            text = "Iniciar Sesión",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            color = Color(253, 247, 254),
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color(241, 169, 60),
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(vertical = 14.dp),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(26.dp))
        Text(
            text = "¿No tienes una cuenta? Regístrate",
            fontWeight = FontWeight.Bold,
            color = Color(241,169,60)
        )
    }

}
    
