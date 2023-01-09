package com.example.busschedule.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity
data class Schedule(
    @PrimaryKey val id: Int,
    @NotNull @ColumnInfo (name = "stop_name") val stopName: String,
    @NotNull @ColumnInfo (name = "arrival_Time") val arrivalTime: String
)
