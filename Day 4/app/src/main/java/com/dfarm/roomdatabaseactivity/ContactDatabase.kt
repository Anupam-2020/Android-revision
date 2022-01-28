package com.dfarm.roomdatabaseactivity

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase


@Database(entities = [Contact::class], version = 2)
@TypeConverters(Converters::class)
abstract class ContactDatabase: RoomDatabase() {

    abstract fun contactDao(): ContactDAO

    companion object {

        private val migration_1_2 = object : Migration(1,2){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE contact ADD COLUMN isActive INTEGER NOT NULL DEFAULT(1)")
            }
        }

        @Volatile //When any value is assigned to the Instance variable then all the threads come to know about this. That means all threads get updated.

        private var Instance: ContactDatabase? = null // Here a private field has been created to get the database value.

        fun getDatabase(context: Context): ContactDatabase { // public function has been created to take the value inside the Instance variable.
            if(Instance == null) {
                // we will have only one instance of the block when more than one threads try to create its instance.
                synchronized(this) {
                    Instance = Room.databaseBuilder(context.applicationContext,
                        ContactDatabase::class.java,
                        "contactDB")
                        .addMigrations(migration_1_2)
                        .build()
                }
            }
            return Instance!!
        }
    }
}