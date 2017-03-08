package com.mo9.neo4j.service.impl;

import com.mo9.neo4j.dao.UserRepository;
import com.mo9.neo4j.domain.User;
import com.mo9.neo4j.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author wtwei
 * @Date 2017/3/2
 * @Time 15:39
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    @Transactional
    public User findById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    @Transactional
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public List findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    @Transactional
    public void deleteAll() {
        userRepository.deleteAll();
    }

    @Override
    @Transactional
    public List findUserByMobile(String mobile) {
        return userRepository.findByMobile(mobile);
    }
}
