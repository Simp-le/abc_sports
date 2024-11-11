package com.abc.sports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import com.abc.sports.ui.SportsApp
import com.abc.sports.ui.theme.SportsTheme

/**
 * Activity for Sports app
 */
class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val screenWidthSize = calculateWindowSizeClass(this)
            SportsTheme {
                SportsApp(screenSize = screenWidthSize.widthSizeClass, onBackPressed = { finish() })
            }
        }
    }
}
