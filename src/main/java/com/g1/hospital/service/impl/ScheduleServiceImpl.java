package com.g1.hospital.service.impl;

import com.g1.hospital.mapper.ScheduleMapper;
import com.g1.hospital.pojo.Schedule;
import com.g1.hospital.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    public Long getScheduleId(Long departmentId, Byte sign, Long userId, Long roomId) {
        return this.scheduleMapper.selectIdByCondition(departmentId, sign, userId, roomId);
    }

    @Override
    public int addSchedule(Schedule schedule) {
        return this.scheduleMapper.insertSelective(schedule);
    }
}
