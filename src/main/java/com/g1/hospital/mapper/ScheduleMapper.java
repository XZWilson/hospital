package com.g1.hospital.mapper;

import com.g1.hospital.pojo.Schedule;
import com.g1.hospital.pojo.ScheduleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScheduleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Schedule record);

    int insertSelective(Schedule record);

    List<Schedule> selectByExample(ScheduleExample example);

    Schedule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Schedule record);

    int updateByPrimaryKey(Schedule record);

    Long selectIdByCondition(@Param("departmentId") Long departmentId,
                             @Param("sign")Byte sign,
                             @Param("userId")Long userId,
                             @Param("roomId")Long roomId);
}