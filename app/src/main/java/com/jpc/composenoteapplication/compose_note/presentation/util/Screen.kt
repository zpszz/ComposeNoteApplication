package com.jpc.composenoteapplication.compose_note.presentation.util

/**
 * @ClassName Screen
 * @Description TODO
 * @Author zzps
 * @Date 2024/6/8 21:47
 * @Version 1.0
 */
sealed class Screen(val route: String) {
    data object NotesScreen: Screen("notes_route")
    data object AddEditNoteScreen: Screen("add_edit_note_screen")
}