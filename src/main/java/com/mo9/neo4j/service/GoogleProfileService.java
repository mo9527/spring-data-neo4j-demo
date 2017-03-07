package com.mo9.neo4j.service;

import com.mo9.neo4j.domain.GoogleProfile;
import org.springframework.stereotype.Service;

/**
 * @Author wtwei
 * @Date 2017/3/1
 * @Time 14:22
 */
@Service
public interface GoogleProfileService {
    GoogleProfile create(GoogleProfile profile);
    void delete(GoogleProfile profile);
    GoogleProfile findById(long id);
    Iterable<GoogleProfile> findAll();
}
