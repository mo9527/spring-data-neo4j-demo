package com.mo9.neo4j.repo;

import com.mo9.neo4j.domain.Company;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @Author wtwei
 * @Date 2017/3/2
 * @Time 15:36
 */
public interface CompaynRepository extends Neo4jRepository<Company> {
}
