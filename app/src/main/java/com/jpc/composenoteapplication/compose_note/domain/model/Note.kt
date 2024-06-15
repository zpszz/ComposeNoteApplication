package com.jpc.composenoteapplication.compose_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.jpc.composenoteapplication.ui.theme.BabyBlue
import com.jpc.composenoteapplication.ui.theme.LightGreen
import com.jpc.composenoteapplication.ui.theme.RedOrange
import com.jpc.composenoteapplication.ui.theme.RedPink
import com.jpc.composenoteapplication.ui.theme.Violet

/**
 * @ClassName Note
 * @Description 笔记实体类
 * @Author zzps
 * @Date 2024/6/8 20:15
 * @Version 1.0
 */
/**
 * 笔记标题
 * 笔记内容
 * 笔记时间戳
 * 笔记颜色
 */
@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null) {
    // 笔记颜色的集合
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
// 异常,用于处理无效笔记
class InvalidNoteException(message: String): Exception(message)