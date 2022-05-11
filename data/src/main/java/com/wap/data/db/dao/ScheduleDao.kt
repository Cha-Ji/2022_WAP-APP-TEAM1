package com.wap.data.db.dao

import androidx.room.*
import com.wap.data.entity.ScheduleEntity

@Dao
interface ScheduleDao {

    // Insert
    @Insert
    fun insertSchedule(schedule: ScheduleEntity)


    // Find
    @Query("SELECT * FROM SCHEDULE WHERE user_id = :userId")
    fun findSchedulesByUserId(userId: Long): List<ScheduleEntity>?

    @Query("SELECT * FROM SCHEDULE WHERE startTime = :startTime")
    fun findSchedulesByStartDate(startTime: Long): List<ScheduleEntity>?


    // Update
    @Update
    fun updateSchedule(schedule: ScheduleEntity)

    
    // Delete
    @Query("DELETE FROM SCHEDULE WHERE user_id = :userId")
    fun deleteSchedulesByUserId(userId: Long)

    @Query("DELETE FROM SCHEDULE WHERE startTime =:startTime")
    fun deleteScheduleByStartTime(startTime: Long)

}
