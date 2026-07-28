package com.example.myapplication1.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.myapplication1.R

val GoogleSansFlex = FontFamily(
    // Regular
    Font(
        resId = R.font.googlesansflex_variable,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(400),
            FontVariation.width(100f),
            FontVariation.Setting("ROND",65f) // ✅ Android 16 sweet spot
        ),
        weight = FontWeight.Normal
    ),
    // Medium
    Font(
        resId = R.font.googlesansflex_variable,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(500),
            FontVariation.Setting("ROND",65f) // ✅ Android 16 sweet spot
        ),
        weight = FontWeight.Medium
    ),
    // SemiBold
    Font(
        resId = R.font.googlesansflex_variable,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(600),
            FontVariation.Setting("ROND",65f) // ✅ Android 16 sweet spot
        ),
        weight = FontWeight.SemiBold
    ),
    // Bold
    Font(
        resId = R.font.googlesansflex_variable,
        variationSettings = FontVariation.Settings(
            FontVariation.weight(700),
            FontVariation.Setting("ROND",65f) // ✅ Android 16 sweet spot
        ),
        weight = FontWeight.Bold
    )
)

// Set of Material typography styles to start with
val AppTypography = Typography(
    displayLarge = TextStyle(fontFamily = GoogleSansFlex, fontSize = 57.sp, lineHeight = 64.sp),
    displayMedium = TextStyle(fontFamily = GoogleSansFlex, fontSize = 45.sp, lineHeight = 52.sp),
    displaySmall = TextStyle(fontFamily = GoogleSansFlex, fontSize = 36.sp, lineHeight = 44.sp),
    headlineLarge = TextStyle(fontFamily = GoogleSansFlex, fontSize = 32.sp, lineHeight = 40.sp),
    headlineMedium = TextStyle(fontFamily = GoogleSansFlex, fontSize = 28.sp, lineHeight = 36.sp),
    headlineSmall = TextStyle(fontFamily = GoogleSansFlex, fontSize = 24.sp, lineHeight = 32.sp),
    titleLarge = TextStyle(fontFamily = GoogleSansFlex, fontSize = 22.sp, lineHeight = 28.sp),
    titleMedium = TextStyle(fontFamily = GoogleSansFlex, fontSize = 16.sp, lineHeight = 24.sp),
    titleSmall = TextStyle(fontFamily = GoogleSansFlex, fontSize = 14.sp, lineHeight = 20.sp),
    bodyLarge = TextStyle(fontFamily = GoogleSansFlex, fontSize = 16.sp, lineHeight = 24.sp),
    bodyMedium = TextStyle(fontFamily = GoogleSansFlex, fontSize = 14.sp, lineHeight = 20.sp),
    bodySmall = TextStyle(fontFamily = GoogleSansFlex, fontSize = 12.sp, lineHeight = 16.sp),
    labelLarge = TextStyle(fontFamily = GoogleSansFlex, fontSize = 14.sp, lineHeight = 20.sp),
    labelMedium = TextStyle(fontFamily = GoogleSansFlex, fontSize = 12.sp, lineHeight = 16.sp),
    labelSmall = TextStyle(fontFamily = GoogleSansFlex, fontSize = 11.sp, lineHeight = 16.sp)
)
