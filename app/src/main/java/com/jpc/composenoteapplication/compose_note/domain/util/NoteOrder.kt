package com.jpc.composenoteapplication.compose_note.domain.util

/**
 * @ClassName NoteOrder
 * @Description 这是一个枚举类，用于定义笔记的排序方式
 * @Author zzps
 * @Date 2024/6/8 20:44
 * @Version 1.0
 */
sealed class NoteOrder(val orderType: OrderType) {
    // 分别是按标题、日期、颜色排序
    class Title(orderType: OrderType): NoteOrder(orderType)
    class Date(orderType: OrderType): NoteOrder(orderType)
    class Color(orderType: OrderType): NoteOrder(orderType)

    // 复制一个新的排序方式, 用于切换排序方式
    fun copy(orderType: OrderType): NoteOrder{
        return when(this){
            is Title -> Title(orderType)
            is Date -> Date(orderType)
            is Color -> Color(orderType)
        }
    }
}