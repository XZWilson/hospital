package com.g1.hospital.service;

import com.g1.hospital.pojo.Schedule;

public interface ScheduleService {
    Long getScheduleId(Long departmentId, Byte sign, Long userId, Long roomId);
    int addSchedule(Schedule schedule);
}
