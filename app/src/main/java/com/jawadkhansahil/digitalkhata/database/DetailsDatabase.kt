package com.jawadkhansahil.digitalkhata.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jawadkhansahil.digitalkhata.model.Detail

@Database(entities = [Detail::class], version = 1)
abstract class DetailsDatabase : RoomDatabase() {
    abstract fun detailsDao(): DetailsDao

    companion object {
        @Volatile
        private var INSTANCE: DetailsDatabase? = null

        fun getDatabase(context: Context, dbName: String): DetailsDatabase {
            return synchronized(this) {
                // Check if database instance already exists
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        DetailsDatabase::class.java,
                        dbName // Use the provided database name
                    ).build()
                } else {
                    // Database instance already exists, check if it's the same as requested
                    if (INSTANCE!!.openHelper.databaseName != dbName) {
                        // Database name is different, close current instance and build new one
                        INSTANCE!!.close()
                        INSTANCE = Room.databaseBuilder(
                            context.applicationContext,
                            DetailsDatabase::class.java,
                            dbName // Use the provided database name
                        ).build()
                    }
                }
                INSTANCE!!
            }
        }
    }
}
