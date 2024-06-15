package com.jpc.composenoteapplication.compose_note.presentation.add_edit_note

import androidx.compose.ui.focus.FocusState

/**
 * @ClassName AddEditNoteEvent
 * @Description TODO
 * @Author zzps
 * @Date 2024/6/9 19:49
 * @Version 1.0
 */
sealed class AddEditNoteEvent {
    data class EnteredTitle(val value: String): AddEditNoteEvent()
    data class EnteredContent(val value: String): AddEditNoteEvent()
    data class ChangeTitleFocus(val focusState: FocusState): AddEditNoteEvent()
    data class ChangeContentFocus(val focusState: FocusState): AddEditNoteEvent()
    data class ChangeColor(val color: Int): AddEditNoteEvent()
    data object SaveNote: AddEditNoteEvent()
}