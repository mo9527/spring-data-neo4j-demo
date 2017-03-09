package com.mo9.neo4j.service.impl;

import com.mo9.neo4j.repo.CompaynRepository;
import com.mo9.neo4j.domain.Company;
import com.mo9.neo4j.service.CompaynService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author wtwei
 * @Date 2017/3/2
 * @Time 15:43
 */
@Service
public class CompanyServiceImpl implements CompaynService {
    @Resource
    private CompaynRepository compaynRepository;

    @Override
    @Transactional
    public Company save(Company company) {
        return compaynRepository.save(company);
    }

    @Override
    public void delete(Company company) {
        compaynRepository.delete(company);
    }

    @Override
    public Company findById(Long id) {
        return compaynRepository.findOne(id);
    }

    @Override
    public Iterable<Company> findAll() {
        return compaynRepository.findAll();
    }

    @Override
    public void deleteAll() {
        compaynRepository.deleteAll();
    }
}
