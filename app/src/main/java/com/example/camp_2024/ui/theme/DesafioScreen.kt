import android.annotation.SuppressLint
import android.provider.CalendarContract
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DesafioScreen() {
    var nomeTarefa by remember { mutableStateOf("") }
    var tarefas by remember { mutableStateOf(listOf<String>()) }

    Scaffold(
        modifier = Modifier.background(Color.White), // Set background color here
        topBar = {
            TopAppBar(
                modifier = Modifier.background(Color(0xFFC1007E)), // Set background color here
                title = {
                    Text(
                        text = "Lista de tarefas",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                actions = {
                    IconButton(
                        onClick = { /* TODO: Adicionar ação do ícone */ },
                        modifier = Modifier.padding(horizontal = 8.dp)
                    ) {
                    }
                }
            )
        },
        content = {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TextField(
                        value = nomeTarefa,
                        onValueChange = { nomeTarefa = it },
                        label = {
                            Text(
                                text = "Nova Tarefa",
                                color = Color(0xFFC1007E),
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                        },
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Button(
                        onClick = {
                            if (nomeTarefa.isNotBlank()) {
                                tarefas = tarefas.toMutableList().apply {
                                    add(nomeTarefa)
                                }
                                nomeTarefa = ""
                            }
                        },
                        colors = ButtonDefaults.buttonColors(Color(0xFFC1007E)),
                        modifier = Modifier.size(width = 80.dp, height = 56.dp)
                    ) {
                        Text(text = "ADD", color = Color.White)
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Column {
                    tarefas.forEach { tarefa ->
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // Coloque aqui o ícone da tarefa
                            Text(
                                text = tarefa,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Checkbox(
                                checked = false,
                                onCheckedChange = null // Adicione a lógica para alterar o estado da tarefa
                            )
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                }
                if (tarefas.isNotEmpty()) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = { /* TODO: Adicionar ação do botão de deletar */ },
                            colors = ButtonDefaults.buttonColors(Color.Gray)
                        ) {
                            Icon(Icons.Default.Delete, contentDescription = null)
                        }
                        // Coloque aqui o ícone do vetor e o texto
                    }
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewHomePage() {
    DesafioScreen()
}


//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.material3.Checkbox
//import androidx.compose.material3.OutlinedTextField
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextButton
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//
//@Composable
//fun DesafioScreen(){
//    var nomeTarefa by remember { mutableStateOf("") } // Variável para armazenar o nome da tarefa atual
//    val tarefas = remember { mutableStateListOf<Pair<String, Boolean>>() }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Top
//    ) {
//        // Entrada de texto para adicionar nova tarefa
//        Row {
//            OutlinedTextField(
//                modifier = Modifier.weight(1f),
//                value = nomeTarefa,
//                onValueChange = { nomeTarefa = it },
//                label = { Text("Nova Tarefa", color = Color.Black)  }
//            )
//            // Botão para adicionar a nova tarefa à lista
//            TextButton(
//                onClick = {
//                    if (nomeTarefa.isNotBlank()) { // Verifica se o nome da tarefa não está vazio
//                        tarefas.add(nomeTarefa to false) // Adiciona a nova tarefa à lista
//                        nomeTarefa = "" // Limpa o campo de entrada de texto
//                    }
//                },
//                modifier = Modifier.padding(start = 16.dp)
//            )  {
//                Text("ADD", color = Color.Black)
//            }
//        }
//
//        // Exibe as tarefas adicionadas na lista
//        tarefas.forEachIndexed { index, (tarefa, isChecked) ->
//            Row(verticalAlignment = Alignment.CenterVertically) {
//                Checkbox(
//                    checked = isChecked,
//                    onCheckedChange = { isChecked ->
//                        tarefas[index] = tarefa to isChecked
//                    },
//                    modifier = Modifier.padding(end = 8.dp)
//                )
//                Text(tarefa)
//            }
//        }
//    }
//}
//
//
//@Preview
//@Composable
//fun DesafioScreenPreview() {
//    DesafioScreen()
//}
//
//
//
//
//
////package com.example.camp_2024.ui.theme
////
////import android.R.attr.background
////import android.R.attr.checked
////import androidx.compose.material3.ButtonDefaults
////import androidx.compose.foundation.background
////import androidx.compose.foundation.layout.Arrangement
////import androidx.compose.foundation.layout.Column
////import androidx.compose.foundation.layout.Row
////import androidx.compose.foundation.layout.fillMaxSize
////import androidx.compose.foundation.layout.padding
////import androidx.compose.material3.Checkbox
////import androidx.compose.material3.OutlinedTextField
////import androidx.compose.material3.Text
////import androidx.compose.material3.TextButton
////import androidx.compose.runtime.Composable
////import androidx.compose.runtime.getValue
////import androidx.compose.runtime.mutableStateOf
////import androidx.compose.runtime.remember
////import androidx.compose.runtime.setValue
////import androidx.compose.ui.Alignment
////import androidx.compose.ui.Modifier
////import androidx.compose.ui.graphics.Color
////import androidx.compose.ui.tooling.preview.Preview
////import androidx.compose.ui.unit.dp
////
////
////@Composable
////fun DesafioScreen(){
////    var nomeTarefa by remember { mutableStateOf("") } // 1
////    val checkedState = remember { mutableStateOf(false) }
////    Column(
////        modifier = Modifier
////            .fillMaxSize()
////            .background(Color.White),
////        horizontalAlignment = Alignment.CenterHorizontally,
////        verticalArrangement = Arrangement.Top
////    ) {
////
////        Row() {
////            OutlinedTextField(
////                modifier = Modifier.padding(top = 0.dp, bottom = 0.dp),
////                value = nomeTarefa,
////                onValueChange = { nomeTarefa = it },
////                label = { Text("Nova Tarefa", color = Color.Black)  }
////            )
////            TextButton(onClick = { /* Ação de adicionar tarefa */ },
////                modifier = Modifier.padding(top = 0.dp, bottom = 0.dp,end= 0.dp),
////                colors = ButtonDefaults.textButtonColors(containerColor = Color.Red,contentColor = Color.Blue) // Definindo a cor do botão para Magenta
////            )  {
////                Text("ADD", color = Color.Black,
////                    modifier = Modifier.padding(top = 60.dp, bottom = 0.dp,end = 10.dp),
////                )
////            }
////        }
////
////        Row(){
////            OutlinedTextField(
////                modifier = Modifier.padding(top = 48.dp, bottom = 0.dp,end = 10.dp),
////                value = nomeTarefa,
////                onValueChange = { nomeTarefa = it },
////                label = { Text("Nova Tarefa", color = Color.Black) }
////            )
////            Checkbox(
////                modifier = Modifier.padding(top = 60.dp, bottom = 0.dp),
////                checked =  checkedState.value,
////                onCheckedChange = { checkedState.value = it }
////            )
////        }
////        Row(){
////            OutlinedTextField(
////                modifier = Modifier.padding(top = 48.dp, bottom = 0.dp,end = 10.dp),
////                value = nomeTarefa,
////                onValueChange = { nomeTarefa = it },
////                label = { Text("Nova Tarefa", color = Color.Black) }
////            )
////            Checkbox(
////                modifier = Modifier.padding(top = 60.dp, bottom = 0.dp),
////                checked =  checkedState.value,
////                onCheckedChange = { checkedState.value = it }
////            )
////        }
////    }
////}
////
////@Preview
////@Composable
////fun DesafioScreenPreview() {
////    DesafioScreen()
////}