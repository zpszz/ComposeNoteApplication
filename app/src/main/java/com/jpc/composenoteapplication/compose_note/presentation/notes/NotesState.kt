package com.jpc.composenoteapplication.compose_note.presentation.notes

import com.jpc.composenoteapplication.compose_note.domain.model.Note
import com.jpc.composenoteapplication.compose_note.domain.util.NoteOrder
import com.jpc.composenoteapplication.compose_note.domain.util.OrderType

/**
 * @ClassName NotesState
 * @Description 定义笔记页面的状态
 * @Author zzps
 * @Date 2024/6/8 21:51
 * @Version 1.0
 */
data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false // 标记按钮组是否显示
)