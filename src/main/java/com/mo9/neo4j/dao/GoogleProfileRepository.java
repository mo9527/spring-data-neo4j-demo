package com.mo9.neo4j.dao;

import com.mo9.neo4j.domain.GoogleProfile;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author wtwei
 * @Date 2017/3/1
 * @Time 14:20
 */
@Repository
public interface GoogleProfileRepository extends GraphRepository<GoogleProfile> {
}
