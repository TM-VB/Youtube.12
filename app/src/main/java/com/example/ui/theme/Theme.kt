package com.example.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme =
  darkColorScheme(
    primary = YouTubeRed,
    onPrimary = Color.White,
    primaryContainer = YouTubeRedDark,
    onPrimaryContainer = Color.White,
    secondary = YouTubeTextPrimary,
    onSecondary = YouTubeBlack,
    secondaryContainer = YouTubeSurfaceContainer,
    onSecondaryContainer = YouTubeTextPrimary,
    background = YouTubeBlack,
    onBackground = YouTubeTextPrimary,
    surface = YouTubeBlack,
    onSurface = YouTubeTextPrimary,
    surfaceVariant = YouTubeSurfaceContainer,
    onSurfaceVariant = YouTubeTextSecondary,
    outline = YouTubeDivider,
    outlineVariant = YouTubeSurfaceContainerHigh,
  )

private val LightColorScheme =
  lightColorScheme(
    primary = YouTubeRed,
    onPrimary = Color.White,
    primaryContainer = Color(0xFFFFEBEE),
    onPrimaryContainer = YouTubeRedDark,
    secondary = Color(0xFF0F0F0F),
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFF2F2F2),
    onSecondaryContainer = Color(0xFF0F0F0F),
    background = Color(0xFFFFFFFF),
    onBackground = Color(0xFF0F0F0F),
    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF0F0F0F),
    surfaceVariant = Color(0xFFF2F2F2),
    onSurfaceVariant = Color(0xFF606060),
    outline = Color(0xFFE5E5E5),
  )

@Composable
fun MyApplicationTheme(
  darkTheme: Boolean = true, // Default to true for the authentic YouTube sleek dark experience
  dynamicColor: Boolean = false, // Keep distinct YouTube Red identity
  content: @Composable () -> Unit,
) {
  val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

  MaterialTheme(colorScheme = colorScheme, typography = Typography, content = content)
}

