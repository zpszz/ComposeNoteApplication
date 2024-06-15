package com.jpc.composenoteapplication.compose_note.domain.use_case

/**
 * @ClassName NoteUseCases
 * @Description 这是一个数据类，它包含了所有的用例类
 * @Author zzps
 * @Date 2024/6/8 21:40
 * @Version 1.0
 */
data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)