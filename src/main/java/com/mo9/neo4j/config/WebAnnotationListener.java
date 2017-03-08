package com.mo9.neo4j.config;

import com.mo9.core.web.annotation.RefBean;
import com.mo9.core.web.exception.WebRuntimeException;
import com.mo9.core.web.service.ApiServiceFactoryBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.Map;

/**
 * @Author wtwei .
 * @Date 2017/3/8 .
 * @Time 17:05 .
 * 用于自动加入@RefBean注解类到ApiServiceFactoryBean进行解析
 */
public class WebAnnotationListener implements ApplicationListener<ContextRefreshedEvent> {

    private ApiServiceFactoryBean apiServiceFactoryBean = new ApiServiceFactoryBean();
    private static final Log logger = LogFactory.getLog(WebAnnotationListener.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Map<String, Object> refBeans = event.getApplicationContext().getBeansWithAnnotation(RefBean.class);
        for(Map.Entry<String, Object> entry : refBeans.entrySet()){
            apiServiceFactoryBean.setObject(entry.getValue());
            try {
                apiServiceFactoryBean.afterPropertiesSet();
                logger.debug("RefBean解析完成：" + entry.getValue().getClass().getName());
            } catch (Exception e) {
                e.printStackTrace();
                throw new WebRuntimeException("未能完成RefBean注解解析,类名：" + entry.getValue().getClass().getName());
            }
        }
    }
}
