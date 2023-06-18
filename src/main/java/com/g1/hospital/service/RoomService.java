package com.g1.hospital.service;


import com.g1.hospital.dto.RoomDto;

public interface RoomService {
    RoomDto getRoomBySchedule(Long departmentId, Byte sign, Long userId);
}
