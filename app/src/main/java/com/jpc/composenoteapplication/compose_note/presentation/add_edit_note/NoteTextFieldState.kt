package com.jpc.composenoteapplication.compose_note.presentation.add_edit_note

/**
 * @ClassName NoteTextFieldState
 * @Description 这是一个数据类，用于存储文本字段的状态
 * @Author zzps
 * @Date 2024/6/9 19:47
 * @Version 1.0
 */
data class NoteTextFieldState(
    val text: String = "", // 文本
    val hint: String = "", // 提示
    val isHintVisible: Boolean = true // 是否显示提示
)