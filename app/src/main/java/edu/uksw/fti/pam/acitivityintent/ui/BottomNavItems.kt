package edu.uksw.fti.pam.acitivityintent.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import edu.uksw.fti.pam.acitivityintent.R

sealed class BottomNavItems(
    val title: String,
    val icon: Int, //diganti integer
    val screen_route: String
) {
    object Home: BottomNavItems("Chat", R.drawable.ic_chat_24, "home")
    object Call: BottomNavItems("Call", R.drawable.ic_call_24, "articlee")
    object Profile: BottomNavItems("Profile", R.drawable.ic_person_24, "profile")
}