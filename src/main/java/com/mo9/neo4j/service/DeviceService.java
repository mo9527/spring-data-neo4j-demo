package com.mo9.neo4j.service;

import com.mo9.neo4j.domain.Device;
import org.springframework.stereotype.Service;

/**
 * @Author wtwei .
 * @Date 2017/3/3 .
 * @Time 17:38 .
 */
@Service
public interface DeviceService {
    public void save(Device device);
}
