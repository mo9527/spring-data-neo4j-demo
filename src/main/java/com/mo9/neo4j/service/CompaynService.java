package com.mo9.neo4j.service;

import com.mo9.neo4j.domain.Company;
import org.springframework.stereotype.Service;

/**
 * @Author wtwei
 * @Date 2017/3/2
 * @Time 15:42
 */
@Service
public interface CompaynService {
    Company save(Company company);
    void delete(Company company);
    Company findById(Long id);
    Iterable<Company> findAll();

    void deleteAll();
}
