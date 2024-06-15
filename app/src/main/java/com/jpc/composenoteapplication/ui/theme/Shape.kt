package com.jpc.composenoteapplication.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

/**
 * @ClassName Shape
 * @Description 定义形状
 * @Author zzps
 * @Date 2024/6/6 22:25
 * @Version 1.0
 */
val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(0.dp) // 0.dp 表示没有圆角
)