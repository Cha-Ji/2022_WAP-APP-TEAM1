package com.wap.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.wap.domain.entity.Schedule
import com.wap.domain.entity.WeekType
import com.wap.domain.datasource.ScheduleDataSource
import java.time.LocalDateTime
import javax.inject.Inject

@RequiresApi(Build.VERSION_CODES.O)
class ScheduleRepository @Inject constructor(
    val scheduleDataSource: ScheduleDataSource
) : ScheduleDataSource {

    private var _currentDate: LocalDateTime = LocalDateTime.now()
    val currentDate get() = _currentDate

    private var _currentDateSchedules: List<Schedule> = emptyList()
    val currentDateSchedules get() = _currentDateSchedules

    fun saveCurrentDateSchedules(currentDateSchedules: List<Schedule>) {
        _currentDateSchedules = currentDateSchedules
    }

    fun saveCurrentDate(currentDate: LocalDateTime) {
        _currentDate = currentDate
    }

    override fun getSchedule(scheduleId: Long): Schedule {
        TODO("Not yet implemented")
    }

    override fun findSchedulesByUserId(userId: Long): List<Schedule> {
        TODO("Not yet implemented")
    }

    override fun findSchedulesByStartTime(startTime: LocalDateTime): List<Schedule> {
        TODO("Not yet implemented")
    }

    override fun createSchedule(schedule: Schedule) {
        TODO("Not yet implemented")
    }

    override fun updateStartTime(date: LocalDateTime) {
        TODO("Not yet implemented")
    }

    override fun updateEndTime(date: LocalDateTime) {
        TODO("Not yet implemented")
    }

    override fun updateColor(color: String) {
        TODO("Not yet implemented")
    }

    override fun updateRecurWeek(weekType: WeekType) {
        TODO("Not yet implemented")
    }

    override fun deleteSchedule(scheduleId: Long) {
        TODO("Not yet implemented")
    }
}