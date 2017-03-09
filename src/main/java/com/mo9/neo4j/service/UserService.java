package com.mo9.neo4j.service;

import com.mo9.neo4j.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wtwei
 * @Date 2017/3/2
 * @Time 15:37
 */
@Service
public interface UserService {

    User save(User user);

    void delete(User user);

    User findById(Long id);

    List<User> findAll();

    List findByName(String name);

    public void deleteAll();

    List findUserByMobile(String mobile);
}
