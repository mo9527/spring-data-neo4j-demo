package com.mo9.neo4j.repo;

import com.mo9.neo4j.domain.relation.User2CompanyRelationShip;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @Author wtwei .
 * @Date 2017/3/3 .
 * @Time 16:51 .
 */
public interface User2CompanyRepository extends Neo4jRepository<User2CompanyRelationShip> {
}
