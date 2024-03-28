package com.jawadkhansahil.digitalkhata.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "customers")
data class Customer(

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val initial: String,
    val toGive: Boolean,
    val money: Int
)