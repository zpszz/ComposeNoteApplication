package com.jpc.composenoteapplication.compose_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jpc.composenoteapplication.compose_note.domain.model.Note

/**
 * @ClassName NoteDatabase
 * @Description 数据库连接类
 * @Author zzps
 * @Date 2024/6/8 20:26
 * @Version 1.0
 */
@Database(entities = [Note::class], version = 1) // 表名、版本
abstract class NoteDatabase: RoomDatabase() {
    abstract val noteDao: NoteDao

    companion object{
        // 数据库名字
        const val DATABASE_NAME = "note_db"
    }
}