package com.anupam.mvvmactivity.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.anupam.mvvmactivity.models.Results


@Database(entities = [Results::class],version = 1)
abstract class QuoteDatabase: RoomDatabase() {

    abstract fun quoteDao(): QuoteDao

    companion object {
        @Volatile
        private var instance: QuoteDatabase? = null // this variable will hold the database.

        // the below fn. helps to access dao.
        fun getDatabase(context: Context): QuoteDatabase {
            if(instance == null) {
                synchronized(this) {
                    instance = Room.databaseBuilder(context,
                        QuoteDatabase::class.java,
                        "quoteDB")
                        .build()
                }
            }
            return instance!!
        }
    }
}