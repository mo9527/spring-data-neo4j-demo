package com.mo9.neo4j;

import com.mo9.neo4j.dao.CommonRepository;
import com.mo9.neo4j.dao.User2CompanyRepository;
import com.mo9.neo4j.domain.Company;
import com.mo9.neo4j.domain.User;
import com.mo9.neo4j.domain.relation.User2CompanyRelationShip;
import com.mo9.neo4j.service.CompaynService;
import com.mo9.neo4j.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * @Author wtwei
 * @Date 2017/3/2
 * @Time 15:46
 */
public class Neo4jTest {

//    @Test
//    @Transactional
//    public void usersWorkForCompayn(){
//        this.deleteAllUser();
//        this.deleteAllCompany();
//
//        ApplicationContext context = new AnnotationConfigApplicationContext(Neo4jConfig.class);
//        CompaynService compaynService = context.getBean(CompaynService.class);
//        UserService userService = context.getBean(UserService.class);
//        User2CompanyRepository user2CompanyRepository = context.getBean(User2CompanyRepository.class);
//
//        User user1 = new User();
//        user1.setName("张三");
//        user1.setCompanyAddress("上海黄浦区延安东路");
//        user1.setMobile("13999999999");
//
//        User user2 = new User();
//        user2.setName("李四");
//        user2.setCompanyAddress("上海浦东新区");
//        user2.setMobile("15890002939");
//
//        Company mo9 = new Company();
//        mo9.setCompanyAddress("上海黄浦区延安东路618号17楼");
//        mo9.setCompaynName("MO9");
//        mo9.setIndustry("金融行业");
//
//
//        User2CompanyRelationShip user2CompanyRelationShip1 = new User2CompanyRelationShip(user1, mo9);
//        user2CompanyRelationShip1.setWorkYears(2.55);
//        user2CompanyRelationShip1.setStartWorkDate(new Date());
//        user2CompanyRepository.save(user2CompanyRelationShip1);
//
//        userService.save(user1);
//        userService.save(user2);
//
//        mo9.hiring(user1);
//        mo9.hiring(user2);
//        compaynService.save(mo9);
//
//    }


//    @Test
//    @Transactional
//    public void findByNameTest(){
//        ApplicationContext context = new AnnotationConfigApplicationContext(Neo4jConfig.class);
//        CompaynService compaynService = context.getBean(CompaynService.class);
//        UserService userService = context.getBean(UserService.class);
//        List<User> users = userService.findByName("张三");
//        System.out.println(users);
//    }
//
//    @Test
//    @Transactional
//    public void deleteAllUser(){
//        ApplicationContext context = new AnnotationConfigApplicationContext(Neo4jConfig.class);
//        CompaynService compaynService = context.getBean(CompaynService.class);
//        UserService userService = context.getBean(UserService.class);
//        userService.deleteAll();
//    }
//
//    @Test
//    @Transactional
//    public void deleteAllCompany(){
//        ApplicationContext context = new AnnotationConfigApplicationContext(Neo4jConfig.class);
//        CompaynService compaynService = context.getBean(CompaynService.class);
//        UserService userService = context.getBean(UserService.class);
//        compaynService.deleteAll();
//    }
//
//    @Test
//    @Transactional
//    public void clearDatabase(){
//        ApplicationContext context = new AnnotationConfigApplicationContext(Neo4jConfig.class);
//        CommonRepository commonRepository = context.getBean(CommonRepository.class);
//        commonRepository.clearDatabase();
//
//    }


}
