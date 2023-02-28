package edu.uksw.fti.pam.acitivityintent.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import edu.uksw.fti.pam.acitivityintent.R
import edu.uksw.fti.pam.acitivityintent.ui.BottomNavItems

var Firstname:String = ""
var Lastname:String = ""

@Composable
fun NavigationGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItems.Home.screen_route
    ) {
        composable(BottomNavItems.Home.screen_route) {
            HomeScreen()
        }
        composable(BottomNavItems.Call.screen_route) {
            CallScreen()
        }
        composable(BottomNavItems.Profile.screen_route) {
            ProfileScreen(Firstname, Lastname)
        }
    }
}



@Composable
fun BottomNavigation(
    navController: NavController,firstname:String,lastname:String
){
    Firstname = firstname
    Lastname = lastname
    val items = listOf(
        BottomNavItems.Home,
        BottomNavItems.Call,
        BottomNavItems.Profile
    )
    androidx.compose.material.BottomNavigation(
        backgroundColor = Color(0XFF7F67BE),
        contentColor = Color.Black
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(
                    tint = Color.White,
                    painter = painterResource(item.icon),
                    contentDescription = "${item.title} icon")
                },
                label = {
                    Text(text = item.title,
                    fontSize = 9.sp)
                },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.Black.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == item.screen_route,
                onClick = {
                    navController.navigate(item.screen_route) {
                        navController.graph.startDestinationRoute?.let { screen_route ->
                            popUpTo(screen_route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}


@Composable
fun TopBar(){

    Row (
        modifier = Modifier
            .background(Color(0XFF7F67BE))
            .fillMaxWidth()
            .padding(top = 7.dp, start = 7.dp, bottom = 7.dp),
        verticalAlignment = Alignment.CenterVertically,


        ){
        Text(text = "LetsTalk", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = {}) {
            Icon(
                painter = painterResource(id = R.drawable.ic_search_24),
                contentDescription = "Search Icon",
                modifier = Modifier.size(25.dp),
                tint = Color.White
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_camera_alt_24),
                contentDescription = "Camera Icon",
                modifier = Modifier.size(25.dp),
                tint = Color.White
            )
        }
    }
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BottomNavigationMainScreenView(username: ArrayList<String>){
    val navController = rememberNavController()
    var lastname:String = username[1]
    var firstname:String = username[0]

    Scaffold(
        topBar = { TopBar() },
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = { FloatingActionButton(onClick = {}){
            Icon(
                painter = painterResource(id = R.drawable.ic_drive_file),
                contentDescription = "Pen Icon",
                modifier = Modifier.size(25.dp)
            )
        } },
        bottomBar = {
            BottomNavigation(
                navController = navController,firstname,lastname
            )
        }
    ) {
        NavigationGraph(navController = navController)
    }
}