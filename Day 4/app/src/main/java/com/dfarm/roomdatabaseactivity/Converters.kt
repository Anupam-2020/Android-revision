package com.dfarm.roomdatabaseactivity

import androidx.room.TypeConverter
import java.util.*

// Type converters are used to get the data types in database which are not supported by our database. Eg. Date()
class Converters {

    @TypeConverter
    fun fromDateToString(value: Date): String {
        return value.toString()
    }


    @TypeConverter
    fun fromLongToDate(value: String): Date {
        return Date(value)
    }
}