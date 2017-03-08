package com.mo9.neo4j;

import com.mo9.neo4j.config.Neo4jConfig;
import com.mo9.neo4j.repo.*;
import com.mo9.neo4j.domain.Company;
import com.mo9.neo4j.domain.Device;
import com.mo9.neo4j.domain.User;
import com.mo9.neo4j.domain.relation.Company2UserRelationShip;
import com.mo9.neo4j.domain.relation.User2CompanyRelationShip;
import com.mo9.neo4j.domain.relation.User2DeviceRelationShip;
import com.mo9.neo4j.service.CompaynService;
import com.mo9.neo4j.service.DeviceService;
import com.mo9.neo4j.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @Author wtwei
 * @Date 2017/3/3
 * @Time 17:36
 */
public class Mo9NeoTest {



    @Test
    public void saveWithRelations(){


//        ApplicationContext context = new AnnotationConfigApplicationContext(Neo4jConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-core.xml");

        UserService userService = context.getBean(UserService.class);
        CompaynService compaynService = context.getBean(CompaynService.class);
        DeviceService deviceService = context.getBean(DeviceService.class);
        User2DeviceRepository user2DeviceRepository = context.getBean(User2DeviceRepository.class);
        User2CompanyRepository user2CompanyRepository = context.getBean(User2CompanyRepository.class);
        Company2UserRepository company2UserRepository = context.getBean(Company2UserRepository.class);

        //创建用户节点
        User user = new User();
        user.setCompanyAddress("北京市朝阳区长安路389号");
        user.setMobile("13878929484");
        user.setName("张三");
        User user2 = new User();
        user2.setCompanyAddress("上海市浦东新区张江镇");
        user2.setMobile("13323231212");
        user2.setName("李四");

        //创建设备节点
        Device device = new Device();
        device.setOsType("IOS");
        device.setOsVersion("9.2.1");
        device.setMo9DeviceId("123456");
        device.setWidth("24");
        device.setHeight("45");
        Device device2 = new Device();
        device2.setOsType("Android");
        device2.setOsVersion("4.4.1");
        device2.setMo9DeviceId("44321221");
        device2.setWidth("21");
        device2.setHeight("42");

        //创建公司节点
        Company company = new Company();
        company.setCompaynName("阿里巴巴集团");
        company.setCompanyAddress("浙江省杭州市");
        company.setIndustry("互联网");
        company.setCompanyPhone("0217-93048573");

        //保存节点
        userService.save(user);
        userService.save(user2);
        deviceService.save(device);
        deviceService.save(device2);
        compaynService.save(company);

        //建立用户与公司的关系，并保存
        User2CompanyRelationShip user2Company = new User2CompanyRelationShip(user, company);
        user2Company.setStartWorkDate(new Date(2015, 2, 21));
        user2Company.setWorkYears(2.5);
        User2CompanyRelationShip user2Company2 = new User2CompanyRelationShip(user2, company);
        user2Company2.setStartWorkDate(new Date(2014, 1, 1));
        user2Company2.setWorkYears(3.5);
        user2CompanyRepository.save(user2Company);
        user2CompanyRepository.save(user2Company2);

        //建立用户与设备的关系，并保存
        User2DeviceRelationShip user2Device = new User2DeviceRelationShip(user, device);
        User2DeviceRelationShip user2Device2 = new User2DeviceRelationShip(user, device2);
        user2DeviceRepository.save(user2Device);
        user2DeviceRepository.save(user2Device2);

        //建立公司与用户的关系
        Company2UserRelationShip company2UserRelationShip = new Company2UserRelationShip(company, user);
        company2UserRelationShip.setHiringDate(new Date());
        company2UserRepository.save(company2UserRelationShip);

    }


    @Transactional
    public void deleteAllUser(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Neo4jConfig.class);
        CompaynService compaynService = context.getBean(CompaynService.class);
        UserService userService = context.getBean(UserService.class);
        userService.deleteAll();
    }

    @Transactional
    public void deleteAllCompany(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Neo4jConfig.class);
        CompaynService compaynService = context.getBean(CompaynService.class);
        UserService userService = context.getBean(UserService.class);
        compaynService.deleteAll();
    }


    public static void main(String[] args) {
        Mo9NeoTest mo9NeoTest = new Mo9NeoTest();
        mo9NeoTest.deleteAllCompany();
        mo9NeoTest.deleteAllUser();
        mo9NeoTest.saveWithRelations();
    }
}
