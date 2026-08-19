package com.example.myapplication1.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AcUnit: ImageVector by lazy {
    ImageVector.Builder(
        name = "AcUnit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = SolidColor(Color.Black),
            fillAlpha = 1f,
            stroke = null,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Bevel,
            strokeLineMiter = 1f,
            pathFillType = PathFillType.Companion.NonZero,
        ) {
            moveTo(11f, 17.85f)
            lineTo(8.43f, 20.38f)
            quadTo(8.15f, 20.65f, 7.74f, 20.65f)
            reflectiveQuadTo(7.05f, 20.35f)
            quadTo(6.75f, 20.08f, 6.75f, 19.66f)
            reflectiveQuadToRelative(0.3f, -0.71f)
            lineTo(11f, 15f)
            verticalLineTo(13f)
            horizontalLineTo(9f)
            lineTo(5.03f, 16.98f)
            quadTo(4.75f, 17.25f, 4.34f, 17.25f)
            reflectiveQuadTo(3.63f, 16.95f)
            quadTo(3.35f, 16.68f, 3.35f, 16.26f)
            reflectiveQuadTo(3.63f, 15.58f)
            lineTo(6.15f, 13f)
            horizontalLineTo(2.98f)
            quadTo(2.55f, 13f, 2.28f, 12.71f)
            quadTo(2f, 12.43f, 2f, 12f)
            reflectiveQuadTo(2.29f, 11.29f)
            reflectiveQuadTo(3f, 11f)
            horizontalLineTo(6.15f)
            lineTo(3.63f, 8.45f)
            quadTo(3.35f, 8.17f, 3.35f, 7.76f)
            reflectiveQuadTo(3.65f, 7.05f)
            quadTo(3.93f, 6.77f, 4.34f, 6.77f)
            reflectiveQuadTo(5.05f, 7.05f)
            lineTo(9f, 11f)
            horizontalLineToRelative(2f)
            verticalLineTo(9f)
            lineTo(7.03f, 5.05f)
            quadTo(6.75f, 4.77f, 6.75f, 4.36f)
            reflectiveQuadTo(7.05f, 3.65f)
            quadTo(7.33f, 3.38f, 7.74f, 3.38f)
            reflectiveQuadTo(8.43f, 3.65f)
            lineTo(11f, 6.15f)
            verticalLineTo(3f)
            quadTo(11f, 2.57f, 11.29f, 2.29f)
            reflectiveQuadTo(12f, 2f)
            reflectiveQuadToRelative(0.71f, 0.29f)
            reflectiveQuadTo(13f, 3f)
            verticalLineTo(6.15f)
            lineToRelative(2.55f, -2.5f)
            quadTo(15.83f, 3.38f, 16.24f, 3.38f)
            reflectiveQuadToRelative(0.71f, 0.27f)
            quadToRelative(0.28f, 0.3f, 0.28f, 0.71f)
            reflectiveQuadTo(16.95f, 5.05f)
            lineTo(13f, 9f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(2f)
            lineTo(18.95f, 7.05f)
            quadTo(19.23f, 6.77f, 19.64f, 6.77f)
            reflectiveQuadToRelative(0.71f, 0.3f)
            quadToRelative(0.27f, 0.27f, 0.27f, 0.69f)
            quadToRelative(0f, 0.41f, -0.27f, 0.69f)
            lineTo(17.85f, 11f)
            horizontalLineTo(21f)
            quadToRelative(0.43f, 0f, 0.71f, 0.29f)
            reflectiveQuadTo(22f, 12f)
            reflectiveQuadToRelative(-0.29f, 0.71f)
            reflectiveQuadTo(21f, 13f)
            horizontalLineTo(17.85f)
            lineToRelative(2.5f, 2.57f)
            quadToRelative(0.27f, 0.28f, 0.27f, 0.69f)
            quadToRelative(0f, 0.41f, -0.27f, 0.69f)
            quadToRelative(-0.3f, 0.3f, -0.71f, 0.3f)
            reflectiveQuadToRelative(-0.69f, -0.3f)
            lineTo(15f, 13f)
            horizontalLineTo(13f)
            verticalLineToRelative(2f)
            lineToRelative(3.95f, 3.98f)
            quadToRelative(0.28f, 0.27f, 0.28f, 0.69f)
            reflectiveQuadToRelative(-0.3f, 0.71f)
            quadToRelative(-0.27f, 0.27f, -0.69f, 0.27f)
            reflectiveQuadTo(15.55f, 20.38f)
            lineTo(13f, 17.85f)
            verticalLineToRelative(3.17f)
            quadToRelative(0f, 0.43f, -0.29f, 0.7f)
            reflectiveQuadTo(12f, 22f)
            reflectiveQuadTo(11.29f, 21.71f)
            quadTo(11f, 21.43f, 11f, 21f)
            verticalLineTo(17.85f)
            close()
        }
    }.build()
}
