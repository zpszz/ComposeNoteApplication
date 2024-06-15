package com.jpc.composenoteapplication.compose_note.domain.util

/**
 * @ClassName OrderType
 * @Description 笔记排序类型
 * @Author zzps
 * @Date 2024/6/8 20:45
 * @Version 1.0
 */
sealed class OrderType {
    object Ascending: OrderType() // 升序
    object Descending: OrderType() // 降序
}