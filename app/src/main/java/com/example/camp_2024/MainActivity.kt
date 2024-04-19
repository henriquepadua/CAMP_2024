package com.example.camp_2024
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.camp_2024.ui.theme.Camp_2024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Camp_2024Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()
//                    val navController = rememberNavController()
//                    NavHost(navController = navController, startDestination = "main"){
//                        composable("main"){
//                            LoginScreen()
//                        }
//                        composable("signIn"){
//                            LoginScreen()
//                        }
//                        composable("main"){
//
//                        }
//                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Tela de Login",
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Blue)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Camp_2024Theme {
        Greeting("Android")
    }
}