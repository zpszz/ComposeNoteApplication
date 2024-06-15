package com.jpc.composenoteapplication.di

import android.app.Application
import androidx.room.Room
import com.jpc.composenoteapplication.compose_note.data.data_source.NoteDatabase
import com.jpc.composenoteapplication.compose_note.data.repository.NoteRepositoryImpl
import com.jpc.composenoteapplication.compose_note.domain.repository.NoteRepository
import com.jpc.composenoteapplication.compose_note.domain.use_case.AddNote
import com.jpc.composenoteapplication.compose_note.domain.use_case.DeleteNote
import com.jpc.composenoteapplication.compose_note.domain.use_case.GetNote
import com.jpc.composenoteapplication.compose_note.domain.use_case.GetNotes
import com.jpc.composenoteapplication.compose_note.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @ClassName AppModule
 * @Description 这是一个Dagger-Hilt的Module类，用于提供依赖注入
 * @Author zzps
 * @Date 2024/6/8 20:31
 * @Version 1.0
 */
@Module //标记为Module类，用于提供依赖注入
@InstallIn(SingletonComponent::class) //标记为SingletonComponent类，用于提供单例依赖注入
object AppModule {
    @Provides //标记为Provides方法，用于提供依赖注入
    @Singleton //标记为Singleton类，用于提供单例依赖注入
    // 提供NoteDatabase的依赖注入，这样就可以在其他地方使用NoteDatabase的实例
    fun provideNoteDatabase(app: Application): NoteDatabase{
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }
    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository{
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases{
        return NoteUseCases(
            getNotes = GetNotes(repository),
            getNote = GetNote(repository),
            addNote = AddNote(repository),
            deleteNote = DeleteNote(repository)
        )
    }
}