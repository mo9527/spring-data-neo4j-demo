package com.mo9.neo4j.service.impl;

import com.mo9.neo4j.repo.DeviceRepository;
import com.mo9.neo4j.domain.Device;
import com.mo9.neo4j.service.DeviceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author wtwei .
 * @Date 2017/3/3 .
 * @Time 17:39 .
 */
@Service
public class DeviceServiceImpl implements DeviceService {
    @Resource
    DeviceRepository deviceRepository;

    @Override
    public void save(Device device) {
        deviceRepository.save(device);
    }
}
