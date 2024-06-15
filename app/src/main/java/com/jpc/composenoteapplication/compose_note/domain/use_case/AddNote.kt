package com.jpc.composenoteapplication.compose_note.domain.use_case

import com.jpc.composenoteapplication.compose_note.domain.model.InvalidNoteException
import com.jpc.composenoteapplication.compose_note.domain.model.Note
import com.jpc.composenoteapplication.compose_note.domain.repository.NoteRepository
import kotlin.jvm.Throws

/**
 * @ClassName AddNote
 * @Description 这是一个用例类，用于添加笔记
 * @Author zzps
 * @Date 2024/6/8 21:19
 * @Version 1.0
 */
class AddNote(private val repository: NoteRepository) {
    @Throws(InvalidNoteException::class) // 用于标记该方法可能会抛出异常
    // operator fun 用于重载操作符，这里重载了invoke操作符
    // invoke操作符是一个函数调用操作符，可以让对象像函数一样被调用
    suspend operator fun invoke(note: Note){
        if(note.title.isBlank()){
            throw InvalidNoteException("笔记的标题不能为空")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("笔记的内容不能为空")
        }
        repository.insertNote(note)
    }
}