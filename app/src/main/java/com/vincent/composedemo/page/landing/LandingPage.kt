package com.vincent.composedemo.page.landing

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.vincent.composedemo.navigator.Router

@Composable
fun LandingPage(navController: NavController) {
    val list = listOf(
        LandingItem(
            name = "Navigator",
            clickRouter = "${Router.NAVIGATOR_PAGE}/v1ncent/32?gender=F"
        ),
        LandingItem(name = "Modifier", clickRouter = Router.MODIFIER_PAGE)
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        list.forEach {
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { navController.navigate(it.clickRouter) }) {
                Text(text = it.name)
            }
        }
    }
}

data class LandingItem(
    val name: String,
    val clickRouter: String
)