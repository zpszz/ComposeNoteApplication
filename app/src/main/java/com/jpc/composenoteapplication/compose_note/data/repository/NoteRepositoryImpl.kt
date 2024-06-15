package com.jpc.composenoteapplication.compose_note.data.repository

import android.provider.ContactsContract
import com.jpc.composenoteapplication.compose_note.data.data_source.NoteDao
import com.jpc.composenoteapplication.compose_note.domain.model.Note
import com.jpc.composenoteapplication.compose_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

/**
 * @ClassName NoteRepositoryImpl
 * @Description 这是一个实现类，用于实现笔记相关的操作
 * @Author zzps
 * @Date 2024/6/8 20:39
 * @Version 1.0
 */
class NoteRepositoryImpl(private val dao: NoteDao): NoteRepository{
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}