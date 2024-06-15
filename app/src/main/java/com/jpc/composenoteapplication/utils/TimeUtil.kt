package com.jpc.composenoteapplication.utils

import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

/**
 * @ClassName TimeUtil
 * @Description TODO
 * @Author zzps
 * @Date 2024/6/12 11:55
 * @Version 1.0
 */
object TimeUtil {
    fun formattedTime(millis: Long): String{
        val instant = Instant.ofEpochMilli(millis)
        val formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm").withZone(ZoneId.systemDefault())
        val formatted = formatter.format(instant)
        return formatted
    }
}