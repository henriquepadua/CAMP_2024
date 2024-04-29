package com.example.camp_2024

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camp_2024.ui.theme.PinkIoasys

@Composable
    fun LoginScreen(onLoginClick: (String, String) -> Unit) {
    var email by remember { mutableStateOf("") } // 1
    var password by remember { mutableStateOf("") }
    var passwordVisibility by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = PinkIoasys),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Seja Bem vindo",
            color = Color.White,
            fontSize = 30.sp
        )
        Text(
            modifier = Modifier.padding(top = 16.dp),
            text = "Lista de Tarefas",
            color = Color.White,
            fontSize = 24.sp,
        )

        OutlinedTextField(
            modifier = Modifier.padding(top = 48.dp, bottom = 16.dp),
            value = email,
            onValueChange = { email = it },
            label = { Text("Digite seu email", color = Color.White) }
        )

        (if (passwordVisibility) null else PasswordVisualTransformation())?.let {
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Digite sua senha", color = Color.White) },
                visualTransformation = it,
            )

            Spacer(Modifier.size(16.dp))

            Button(onClick = {
            }) {
                Text(text = "Entrar", fontSize = 16.sp)

            }
        }

    }
}
    @Preview
    @Composable
    fun LoginScreenPreview() {
        LoginScreen(onLoginClick = {email, password->
        })
    }
