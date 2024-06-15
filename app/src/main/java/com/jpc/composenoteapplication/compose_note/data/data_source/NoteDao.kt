package com.jpc.composenoteapplication.compose_note.data.data_source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jpc.composenoteapplication.compose_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * @ClassName NoteDao
 * @Description 查询笔记的Dao层接口
 * @Author zzps
 * @Date 2024/6/8 20:22
 * @Version 1.0
 */
@Dao
interface NoteDao {
    @Query("select * from note")
    fun getNotes(): Flow<List<Note>>

    @Query("select * from note where id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}