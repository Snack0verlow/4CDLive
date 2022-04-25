package com.snack0verflow.a4cdlive

import android.security.keystore.StrongBoxUnavailableException
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val name: String,
    val route: String,
    val icon: ImageVector
)
