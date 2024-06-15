package com.jpc.composenoteapplication.compose_note.domain.repository

import com.jpc.composenoteapplication.compose_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * @ClassName NoteRepository
 * @Description 这是一个接口，用于定义与笔记相关的操作，
 * 为什么要定义这个接口呢？因为我们要实现依赖反转，这样我们就可以在不同的地方使用不同的实现
 * @Author zzps
 * @Date 2024/6/8 20:35
 * @Version 1.0
 */
interface NoteRepository {
    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}