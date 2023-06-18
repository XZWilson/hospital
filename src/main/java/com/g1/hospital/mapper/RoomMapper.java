package com.g1.hospital.mapper;

import com.g1.hospital.dto.RoomDto;
import com.g1.hospital.pojo.Room;
import com.g1.hospital.pojo.RoomExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoomMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Room record);

    int insertSelective(Room record);

    List<Room> selectByExample(RoomExample example);

    Room selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);

    RoomDto selectBySchedule(@Param("departmentId") Long departmentId,
                             @Param("sign")Byte sign,
                             @Param("userId")Long userId);
}