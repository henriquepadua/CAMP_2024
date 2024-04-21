import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun DesafioScreen(){
    var nomeTarefa by remember { mutableStateOf("") } // Variável para armazenar o nome da tarefa atual
    val tarefas = remember { mutableStateListOf<String>() } // Lista para armazenar as tarefas adicionadas

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        // Entrada de texto para adicionar nova tarefa
        Row {
            OutlinedTextField(
                modifier = Modifier.weight(1f),
                value = nomeTarefa,
                onValueChange = { nomeTarefa = it },
                label = { Text("Nova Tarefa", color = Color.Black)  }
            )
            // Botão para adicionar a nova tarefa à lista
            TextButton(
                onClick = {
                    if (nomeTarefa.isNotBlank()) { // Verifica se o nome da tarefa não está vazio
                        tarefas.add(nomeTarefa) // Adiciona a nova tarefa à lista
                        nomeTarefa = "" // Limpa o campo de entrada de texto
                    }
                },
                modifier = Modifier.padding(start = 16.dp)
            )  {
                Text("ADD", color = Color.Black)
            }
        }

        // Exibe as tarefas adicionadas na lista
        tarefas.forEach { tarefa ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = false, // Você pode adicionar um estado para controlar se a tarefa está concluída ou não
                    onCheckedChange = {  },
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(tarefa)
            }
        }
    }
}

@Preview
@Composable
fun DesafioScreenPreview() {
    DesafioScreen()
}





//package com.example.camp_2024.ui.theme
//
//import android.R.attr.background
//import android.R.attr.checked
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Checkbox
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextButton
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//
//
//@Composable
//fun DesafioScreen(){
//    var nomeTarefa by remember { mutableStateOf("") } // 1
//    val checkedState = remember { mutableStateOf(false) }
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Top
//    ) {
//
//        Row() {
//            OutlinedTextField(
//                modifier = Modifier.padding(top = 0.dp, bottom = 0.dp),
//                value = nomeTarefa,
//                onValueChange = { nomeTarefa = it },
//                label = { Text("Nova Tarefa", color = Color.Black)  }
//            )
//            TextButton(onClick = { /* Ação de adicionar tarefa */ },
//                modifier = Modifier.padding(top = 0.dp, bottom = 0.dp,end= 0.dp),
//                colors = ButtonDefaults.textButtonColors(containerColor = Color.Red,contentColor = Color.Blue) // Definindo a cor do botão para Magenta
//            )  {
//                Text("ADD", color = Color.Black,
//                    modifier = Modifier.padding(top = 60.dp, bottom = 0.dp,end = 10.dp),
//                )
//            }
//        }
//
//        Row(){
//            OutlinedTextField(
//                modifier = Modifier.padding(top = 48.dp, bottom = 0.dp,end = 10.dp),
//                value = nomeTarefa,
//                onValueChange = { nomeTarefa = it },
//                label = { Text("Nova Tarefa", color = Color.Black) }
//            )
//            Checkbox(
//                modifier = Modifier.padding(top = 60.dp, bottom = 0.dp),
//                checked =  checkedState.value,
//                onCheckedChange = { checkedState.value = it }
//            )
//        }
//        Row(){
//            OutlinedTextField(
//                modifier = Modifier.padding(top = 48.dp, bottom = 0.dp,end = 10.dp),
//                value = nomeTarefa,
//                onValueChange = { nomeTarefa = it },
//                label = { Text("Nova Tarefa", color = Color.Black) }
//            )
//            Checkbox(
//                modifier = Modifier.padding(top = 60.dp, bottom = 0.dp),
//                checked =  checkedState.value,
//                onCheckedChange = { checkedState.value = it }
//            )
//        }
//    }
//}
//
//@Preview
//@Composable
//fun DesafioScreenPreview() {
//    DesafioScreen()
//}