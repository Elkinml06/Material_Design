package com.elkinmendoza.materialdesign

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elkinmendoza.materialdesign.ui.theme.MaterialDesignTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            explicacionClase()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun explicacionClase (){
    Scaffold(
        topBar = {
            MyTopBar()
        },
        floatingActionButton = {
            MyFloatingActionButton()
        },
        bottomBar = {
            MyNavigationBar()
        }
    ) { innerPadding ->
        Column( modifier = Modifier.padding(innerPadding).padding(18.dp)) {
            CuerpoScaffold()
        }
    }


}
@Composable
fun MyFloatingActionButton(){
    FloatingActionButton(onClick = {}) {
        Icon(imageVector = Icons.Default.Add, contentDescription = null)
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar(){
    TopAppBar(
        title = {
            Text("Top App Bar")
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        )

    )
}
@Composable
fun MyNavigationBar(){
    NavigationBar() {
        NavigationBarItem(
            onClick = {},
            selected = false,
            icon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = null)
            }
        )
        NavigationBarItem(
            onClick = {},
            selected = false,
            icon = {
                Icon(imageVector = Icons.Default.Favorite, contentDescription = null)
            }
        )
        NavigationBarItem(
            onClick = {},
            selected = false,
            icon = {
                Icon(imageVector = Icons.Default.Settings, contentDescription = null)
            }
        )
    }
}
@Composable
fun CuerpoScaffold(){
    Card(

        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation((12.dp))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment
                .CenterVertically
        ){

            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "Avatar",
                modifier = Modifier
                    .size(60.dp)
            )
            Text(
                text = "Tarjeta de presentación",
                modifier = Modifier
                    .weight(1f)
            )
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.MoreVert, contentDescription = "Opciones")
            }
        }
    }
    Spacer(modifier = Modifier.height(28.dp))

    TextField(
        value = "",
        onValueChange = {},
        modifier = Modifier.fillMaxWidth(),
        label = {
            Text("Busca o escribe algo")
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
        },
        trailingIcon = {
            Icon(imageVector = Icons.Default.Close, contentDescription = null)
        }
    )
    Spacer(modifier = Modifier.height(28.dp))
    OutlinedTextField(
        value = "",
        onValueChange = {},
        modifier = Modifier.fillMaxWidth(),
        label = {
            Text("Busca o escribe algo")
        },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
        },
        trailingIcon = {
            Icon(imageVector = Icons.Default.Close, contentDescription = null)
        }
    )
}