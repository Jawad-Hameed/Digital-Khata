package com.jawadkhansahil.digitalkhata.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.jawadkhansahil.digitalkhata.model.Detail

@Dao
interface DetailsDao {

    @Query("SELECT * FROM user_table")
    fun getDetails(): LiveData<List<Detail>>

    @Insert
    suspend fun createDetails(detail: Detail)

    @Delete
    suspend fun deleteDetails(detail: Detail)

    @Update
    suspend fun updateDetails(detail: Detail)
}