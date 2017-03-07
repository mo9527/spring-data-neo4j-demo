package com.mo9.neo4j.service.impl;

import com.mo9.neo4j.dao.GoogleProfileRepository;
import com.mo9.neo4j.service.GoogleProfileService;
import com.mo9.neo4j.domain.GoogleProfile;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author wtwei
 * @Date 2017/3/1
 * @Time 14:23
 */
@Service(value = "googleProfileService")
public class GoogleProfileServiceImpl implements GoogleProfileService {
    @Resource
    private GoogleProfileRepository googleProfileRepository;

    public GoogleProfile create(GoogleProfile profile) {
        return googleProfileRepository.save(profile);
    }

    public void delete(GoogleProfile profile) {
        googleProfileRepository.delete(profile);
    }

    public GoogleProfile findById(long id) {
        return googleProfileRepository.findOne(id);
    }

    public Iterable<GoogleProfile> findAll() {
        return googleProfileRepository.findAll();
    }
}
