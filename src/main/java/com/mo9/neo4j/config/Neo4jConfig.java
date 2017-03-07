package com.mo9.neo4j.config;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableExperimentalNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author wtwei
 * @Date 2017/3/1
 * @Time 15:33
 */
@Configuration
@ComponentScan(value = "com.mo9.neo4j") //neo4j的扫描包
@EnableExperimentalNeo4jRepositories(basePackages = {"com.mo9.neo4j.dao",
        "org.springframework.data.neo4j", "org.neo4j.graphdb"}) //repository所在的包，相当于dao层
@EnableTransactionManagement //启用事物管理
public class Neo4jConfig{
    @Bean
    public SessionFactory getSessionFactory() {
        return new SessionFactory(getConfiguration(),"com.mo9.neo4j.domain");
    }
    /**
     * 配置事物管理
     */
    @Bean
    public Neo4jTransactionManager transactionManager() throws Exception{
        return new Neo4jTransactionManager(getSessionFactory());
    }
    /**
     * 在neo4j.properties文件中配置驱动和连接
     * @return
     */
    @Bean
    public org.neo4j.ogm.config.Configuration getConfiguration(){
        org.neo4j.ogm.config.Configuration configuration =
                new org.neo4j.ogm.config.Configuration("neo4j.properties");
        return configuration;
    }
}
