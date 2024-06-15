package com.jpc.composenoteapplication.compose_note.domain.use_case

import com.jpc.composenoteapplication.compose_note.domain.model.Note
import com.jpc.composenoteapplication.compose_note.domain.repository.NoteRepository

/**
 * @ClassName DeleteNote
 * @Description TODO
 * @Author zzps
 * @Date 2024/6/8 21:24
 * @Version 1.0
 */
class DeleteNote(private val repository: NoteRepository) {
    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}