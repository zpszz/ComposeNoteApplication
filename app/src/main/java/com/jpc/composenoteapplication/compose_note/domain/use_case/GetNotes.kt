package com.jpc.composenoteapplication.compose_note.domain.use_case

import com.jpc.composenoteapplication.compose_note.domain.model.Note
import com.jpc.composenoteapplication.compose_note.domain.repository.NoteRepository
import com.jpc.composenoteapplication.compose_note.domain.util.NoteOrder
import com.jpc.composenoteapplication.compose_note.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/**
 * @ClassName GetNotes
 * @Description 获取笔记，并且根据排序方式进行排序
 * @Author zzps
 * @Date 2024/6/8 21:27
 * @Version 1.0
 */
class GetNotes(private val repository: NoteRepository) {
    operator fun invoke(noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)): Flow<List<Note>>{
        return repository.getNotes().map { notes ->
            when(noteOrder.orderType){
                is OrderType.Ascending -> {
                    when(noteOrder){
                        is NoteOrder.Title -> notes.sortedBy { it.title.first() }
                        is NoteOrder.Date -> notes.sortedBy { it.timestamp }
                        is NoteOrder.Color -> notes.sortedBy { it.color }
                    }
                }
                is OrderType.Descending -> {
                    when(noteOrder){
                        is NoteOrder.Title -> notes.sortedByDescending { it.title.first() }
                        is NoteOrder.Date -> notes.sortedByDescending { it.timestamp }
                        is NoteOrder.Color -> notes.sortedByDescending { it.color }
                    }
                }
            }
        }
    }
}