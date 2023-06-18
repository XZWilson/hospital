package com.g1.hospital.service.impl;

import com.g1.hospital.dto.RegCondition;
import com.g1.hospital.dto.RegDetailDto;
import com.g1.hospital.dto.RegistryDto;
import com.g1.hospital.mapper.RegistryMapper;
import com.g1.hospital.pojo.Registry;
import com.g1.hospital.service.RegistryService;
import com.g1.hospital.utils.PageParameter;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Service
@Transactional
public class RegistryServiceImpl implements RegistryService {
    @Autowired
    private RegistryMapper registryMapper;

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public PageInfo<Registry> getRegistries(PageParameter pageParameter) {
        //开启分页
        PageHelper.startPage(pageParameter.getPageIndex(), pageParameter.getPageSize());
        //调用持久化操作查询当页数据

        //返回PageInfo对象
        return null;
    }

    @Override
    public Integer addRegistry(Registry registry) {
        return this.registryMapper.insertSelective(registry);
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public PageInfo<RegistryDto> searchRegistry(RegCondition regCondition) {
        PageHelper.startPage(regCondition.getPageIndex(),regCondition.getPageSize());
        return new PageInfo<>(this.registryMapper.selectRegistryByPage(regCondition));
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public RegDetailDto searchRegDetailById(Long id) {
        return this.registryMapper.selectRegDetailById(id);
    }
}
