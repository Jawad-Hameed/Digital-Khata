package com.jawadkhansahil.digitalkhata.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jawadkhansahil.digitalkhata.model.Customer

@Database(entities = [Customer::class], version = 1)
abstract class CustomerDatabase : RoomDatabase(){
    abstract fun customerDao() : CustomerDao

    companion object{
        var INSTANCE : CustomerDatabase?  = null

        fun getDatabase(context: Context) : CustomerDatabase{
            if (INSTANCE == null){
                synchronized(this){
                INSTANCE = Room.databaseBuilder(context, CustomerDatabase::class.java, "customer_database").build()
                }
            }

            return INSTANCE!!
        }

    }
}