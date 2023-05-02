package top.umair.tecjaunttask.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import top.umair.tecjaunttask.navigation.InnovatorBottomNavigation
import top.umair.tecjaunttask.navigation.InnovatorNavigationGraph
import top.umair.tecjaunttask.viewModel.InnovatorViewModel

@Composable
fun InnovatorMainScreen(userViewModel: InnovatorViewModel) {
    val navController = rememberNavController()
    Scaffold(

        bottomBar = { InnovatorBottomNavigation(navController = navController) },
        content = { padding ->
            Box(modifier = Modifier.padding(padding)) {
                InnovatorNavigationGraph(navController = navController,userViewModel)
            }
        },
        backgroundColor = Color.White // Set background color to avoid the white flashing when you switch between screens
    )
}