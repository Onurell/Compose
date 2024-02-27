package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun SonucEkrani(sonuc:Boolean, navController : NavController) {
    val tf = remember { mutableStateOf("") }


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        if(sonuc) {
            Text(
            text = "Kazandiniz",
            color = Color.Black,
            fontSize = 36.sp
        )
        Image(
            painter = painterResource(id = R.drawable.kazandin_resmi),
            contentDescription = "")
        }

        else{
            Text(
                text = "Kaybettiniz",
                color = Color.Black,
                fontSize = 36.sp
            )
            Image(
                painter = painterResource(id = R.drawable.kaybettin_resmi),
                contentDescription = "")
        }

        Button(onClick = {navController.navigate("anasayfa")},modifier = Modifier.size(250.dp,50.dp)){Text("Yeniden Basla")}


    }

}