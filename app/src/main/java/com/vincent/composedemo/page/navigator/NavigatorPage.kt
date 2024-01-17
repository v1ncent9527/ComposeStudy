package com.vincent.composedemo.page.navigator

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun NavigatorPage(name: String, age: Int, gender: String?, navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "back", Modifier.clickable {
            navController.popBackStack()
        })
        Text(
            text = "my name is ${name}, and i am $age years old $gender",
            modifier = Modifier.padding(16.dp)
        )
    }
}