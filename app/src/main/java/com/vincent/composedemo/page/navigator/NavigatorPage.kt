package com.vincent.composedemo.page.navigator

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun NavigatorPage(name: String, age: Int, gender: String?, navController: NavController) {
    Text(text = "my name is ${name}, and i am $age years old $gender", modifier = Modifier.padding(16.dp))
}