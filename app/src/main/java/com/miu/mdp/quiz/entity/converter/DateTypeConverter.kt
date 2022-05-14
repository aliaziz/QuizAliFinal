package com.miu.mdp.quiz.entity.converter

import androidx.room.TypeConverter
import java.util.*

class DateTypeConverter {
    @TypeConverter
    fun toDate(timestamp: Long): Date {
        return Date(timestamp)
    }

    @TypeConverter
    fun fromDate(date: Date): Long {
        return date.time
    }
}
