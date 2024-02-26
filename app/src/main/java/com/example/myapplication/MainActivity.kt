package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SayfaButtonTextfield()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        SayfaButtonTextfield()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SayfaButtonTextfield() {
    val tf = remember { mutableStateOf("")}
    val alinanVeri = remember { mutableStateOf("")}
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement =  Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Gelen veri : ${alinanVeri.value}")
        TextField(
            value = tf.value,
            onValueChange = {tf.value = it},
            label = { Text(text = "Veri giriniz")})

        Button(onClick = {
            alinanVeri.value = tf.value
        }) {
            Text(text = "Veriyi Al")
        }
    }



}

