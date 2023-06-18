package com.g1.hospital.service.impl;

import com.g1.hospital.dto.RoomDto;
import com.g1.hospital.mapper.RoomMapper;
import com.g1.hospital.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomMapper roomMapper;

    @Override
    public RoomDto getRoomBySchedule(Long departmentId, Byte sign, Long userId) {
        return this.roomMapper.selectBySchedule(departmentId, sign, userId);
    }
}
