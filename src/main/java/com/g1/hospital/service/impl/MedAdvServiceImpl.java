package com.g1.hospital.service.impl;

import com.g1.hospital.mapper.MedicalAdviceMapper;
import com.g1.hospital.mapper.RegistryMapper;
import com.g1.hospital.pojo.MedicalAdvice;
import com.g1.hospital.pojo.MedicalAdviceExample;
import com.g1.hospital.pojo.Registry;
import com.g1.hospital.service.MedAdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @Author:Jason Yang
 * @version:
 * @date:
 */
@Service
@Transactional
public class MedAdvServiceImpl implements MedAdvService {
    @Autowired
    private MedicalAdviceMapper medicalAdviceMapper;
    @Autowired
    private RegistryMapper registryMapper;

    @Override
    public boolean addAdvice(MedicalAdvice advice) {
        try {
            MedicalAdviceExample adviceExample = new MedicalAdviceExample();
            MedicalAdviceExample.Criteria criteria = adviceExample.createCriteria();
            criteria.andRegistryIdEqualTo(advice.getRegistryId());
            this.medicalAdviceMapper.selectByExample(adviceExample);

            if (this.medicalAdviceMapper.selectByExample(adviceExample).size() == 0){//证明是第一次，添加医嘱
                advice.setCreatedTime(new Date());
                advice.setUpdatedTime(advice.getCreatedTime());
                this.medicalAdviceMapper.insertSelective(advice);

                //此时要将相关挂号单状态改成2-就诊中
                Registry registry = new Registry();
                registry.setId(advice.getRegistryId());
                registry.setStatus(new Integer(2).byteValue());
                this.registryMapper.updateByPrimaryKeySelective(registry);
            }else{ //不是第一次，修改医嘱
                advice.setUpdatedTime(new Date());
                this.medicalAdviceMapper.updateByPrimaryKeySelective(advice);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
