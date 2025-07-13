package com.example.cidishkaproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import com.example.cidishkaproject.ui.theme.ciDishkaProjectTheme
import com.example.cidishkaapplib.Dope

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ciDishkaProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
internal fun greeting(modifier: Modifier = Modifier) {
    val nope = remember { Nope() }
    Text(
        text = nope.greeting(),
        modifier = modifier.testTag("testTag")
    )
}

internal class Nope {

    private val dope = Dope()

    fun greeting(): String {
        return dope.helloWorld() + " Android"
    }
}
