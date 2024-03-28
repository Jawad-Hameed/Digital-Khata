package com.jawadkhansahil.digitalkhata.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.jawadkhansahil.digitalkhata.model.Customer

@Dao
interface CustomerDao {

    @Query("SELECT * FROM customers")
    fun getCustomer() : LiveData<List<Customer>>

    @Insert
    suspend fun createCustomer(customers: Customer)

    @Update
    suspend fun updateCustomer(customers: Customer)

    @Delete
    suspend fun deleteCustomer(customers: Customer)

}