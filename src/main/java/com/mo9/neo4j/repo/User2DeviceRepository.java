package com.mo9.neo4j.repo;

import com.mo9.neo4j.domain.relation.User2DeviceRelationShip;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @Author wtwei .
 * @Date 2017/3/3 .
 * @Time 17:52 .
 */
public interface User2DeviceRepository extends Neo4jRepository<User2DeviceRelationShip> {
}
