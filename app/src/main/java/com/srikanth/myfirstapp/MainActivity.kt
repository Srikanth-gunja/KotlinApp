package com.srikanth.myfirstapp

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers
import androidx.compose.ui.unit.dp
import com.srikanth.myfirstapp.ui.theme.MyFirstAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.primary) {

                }
            }
        }
    }
}

@Composable
fun UnitConvertor(){
        Column {
            Text(text = "UnitConvertor")

            OutlinedTextField(value = "", onValueChange ={} , placeholder = { Text(text = "Enter the value")})
            Row {
                   var context = LocalContext.current
                    Button(onClick = { Toast.makeText(context,"Fuck you",Toast.LENGTH_SHORT).show() },modifier= Modifier.fillMaxWidth(0.4f)) {
                            Text(text = "submit")
                    }
                    Button(onClick = { /*TODO*/ },modifier= Modifier.fillMaxWidth()) {
                            Text(text = "Clear")
                    }
                }
            Text(text = "Result:")
        }

}

@Composable
@Preview
fun UnitConvertorpreview(){
 UnitConvertor()
}