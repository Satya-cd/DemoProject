package com.example.stringgetterlib

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TextInputComponent(
    onTextSubmitted: (String) -> Unit
) {
    var text by remember { mutableStateOf("") }

    val list = mutableListOf<String>("Hii", "Hello", "fdd", "dfdf")

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)) {

        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Enter text") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = {
            onTextSubmitted(text)
        }) {
            Text("Submit")
        }

        list.forEach { item ->
            Text(text = item)
        }
    }
}