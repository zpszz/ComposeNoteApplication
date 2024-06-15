package com.jpc.composenoteapplication.compose_note.domain.use_case

import com.jpc.composenoteapplication.compose_note.domain.model.Note
import com.jpc.composenoteapplication.compose_note.domain.repository.NoteRepository

/**
 * @ClassName GetNote
 * @Description TODO
 * @Author zzps
 * @Date 2024/6/8 21:25
 * @Version 1.0
 */
class GetNote(private val repository: NoteRepository) {
    suspend operator fun invoke(id: Int): Note?{
        return repository.getNoteById(id)
    }
}