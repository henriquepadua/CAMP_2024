package com.example.camp_2024

import androidx.compose.foundation.background
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.camp_2024.ui.theme.PinkIoasys

@Composable
    fun LoginScreen(){
        var nameError by remember { mutableStateOf(false) } // 1
        var visualTransformation = 0;
        var email by remember {
            mutableStateOf("")
        }

        var password by remember {
            mutableStateOf("")
        }

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
                label = { Text("Digite seu email" ,color = Color.White)  }
            )

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Digite sua senha",color =  Color.White) }
//                visualTransformation = PasswordVisualTransformation(),
//                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )

            Spacer(Modifier.size(16.dp))

            Button(onClick = {

            }) {
                Text(text = "Entrar" , fontSize = 16.sp)

            }
        }
    }

    @Preview
    @Composable
    fun LoginScreenPreview(){
        LoginScreen()
    }
