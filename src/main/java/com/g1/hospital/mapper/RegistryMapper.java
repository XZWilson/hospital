package com.g1.hospital.mapper;

import com.g1.hospital.dto.RegCondition;
import com.g1.hospital.dto.RegDetailDto;
import com.g1.hospital.dto.RegistryDto;
import com.g1.hospital.pojo.Registry;
import com.g1.hospital.pojo.RegistryExample;
import java.util.List;

public interface RegistryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Registry record);

    int insertSelective(Registry record);

    List<Registry> selectByExample(RegistryExample example);

    Registry selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Registry record);

    int updateByPrimaryKey(Registry record);

    List<RegistryDto> selectRegistryByPage(RegCondition regCondition);

    RegDetailDto selectRegDetailById(Long id);
}