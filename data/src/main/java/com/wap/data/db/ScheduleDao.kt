package com.wap.data.db

import androidx.room.*
import com.wap.data.entity.ScheduleEntity

@Dao
interface ScheduleDao {

    @Insert
    fun insertSchedule(schedule: ScheduleEntity)

    @Query("SELECT * FROM SCHEDULE WhERE user_id = :userId")
    fun getScheduleByUserId(userId: Long)

    @Query("SELECT * FROM SCHEDULE WHERE startTime = :startTime")
    fun getScheduleByDate(startTime: Long)

    @Update
    fun updateSchedule(schedule: ScheduleEntity)

    @Delete
    fun deleteSchedule(schedule: ScheduleEntity)

}