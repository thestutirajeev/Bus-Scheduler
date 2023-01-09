package com.example.busschedule.database

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ScheduleDao {
    @Query("SELECT * FROM schedule ORDER BY arrival_Time ASC")
    fun getAll(): Flow<List<Schedule>>

    @Query(" SELECT * FROM Schedule WHERE stop_name = :stopName ORDER BY arrival_Time ASC")
    suspend fun getByStopName(stopName:String): Flow<List<Schedule>>
}