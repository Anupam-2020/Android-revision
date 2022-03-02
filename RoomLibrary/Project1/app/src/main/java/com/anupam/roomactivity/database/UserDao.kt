package com.anupam.roomactivity.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao // DAO(Data Access Object) -> Dao contains methods used for accessing the database.
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE) // Would not let any duplicate entry or in our case entry with same user.
    suspend fun addUser(user: User)

    @Query("select * from user_table order by id asc")
    fun readAllData(): LiveData<List<User>>
}