package com.jawadkhansahil.digitalkhata.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class Detail (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val dateTime: String,
    val money: Long,
    val gave: Boolean,
    val details: String
)