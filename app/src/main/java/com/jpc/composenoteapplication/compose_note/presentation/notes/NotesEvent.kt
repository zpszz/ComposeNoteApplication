package com.jpc.composenoteapplication.compose_note.presentation.notes

import com.jpc.composenoteapplication.compose_note.domain.model.Note
import com.jpc.composenoteapplication.compose_note.domain.util.NoteOrder

/**
 * @ClassName NotesEvent
 * @Description 定义对笔记的操作事件
 * @Author zzps
 * @Date 2024/6/8 22:02
 * @Version 1.0
 */
sealed class NotesEvent {
    // 排序
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    // 删除笔记
    data class DeleteNote(val note: Note): NotesEvent()
    // 恢复笔记, 撤销删除
    // 这里设计为单例对象, 是为了表示只有一个恢复笔记的事件，可以理解为只有一个撤销删除的事件
    object RestoreNote: NotesEvent()
    // 切换排序方式
    object ToggleOrderSection: NotesEvent()
}