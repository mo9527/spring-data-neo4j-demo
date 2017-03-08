package com.mo9.neo4j.repo;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author wtwei .
 * @Date 2017/3/6 .
 * @Time 16:54 .
 */
public interface CommonRepository extends Neo4jRepository {

    @Query("MATCH (n) OPTIONAL MATCH (n)-[r]-() DELETE r, n")
    @Transactional
    public void clearDatabase();
}
