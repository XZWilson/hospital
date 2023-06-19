package com.g1.hospital.service;

import com.g1.hospital.dto.RegCondition;
import com.g1.hospital.dto.RegDetailDto;
import com.g1.hospital.dto.RegistryDto;
import com.g1.hospital.pojo.Registry;
import com.g1.hospital.utils.PageParameter;
import com.github.pagehelper.PageInfo;

public interface RegistryService {
    PageInfo<Registry> getRegistries(PageParameter pageParameter);
    Integer addRegistry(Registry registry);
    PageInfo<RegistryDto> searchRegistry(RegCondition regCondition);
    RegDetailDto searchRegDetailById(Long id);
    Integer changeRegStatus(Long id, Byte status);
}
