package com.example.a24012011083_practical_5_mad

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a24012011083_practical_5_mad.ui.theme._24012011083_Practical_5_MADTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _24012011083_Practical_5_MADTheme {
                AppNavigation(this)
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    androidx.compose.material3.Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _24012011083_Practical_5_MADTheme {
        Greeting("Android")
    }
}
@Composable
@Preview
fun ButtonDemo(){
    var counter by remember { mutableStateOf(1) }
    Button(
        onClick = {
            counter+=1
        }
    ){
        Text(
            text = counter.toString(),
        )

    }
}
