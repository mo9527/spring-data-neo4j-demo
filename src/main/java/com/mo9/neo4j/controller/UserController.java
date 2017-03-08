package com.mo9.neo4j.controller;

import com.mo9.commonutil.web.JsonUtil;
import com.mo9.core.web.annotation.ApiService;
import com.mo9.core.web.entity.ResultEntity;
import com.mo9.neo4j.domain.User;
import com.mo9.neo4j.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.List;

/**
 * @Author wtwei .
 * @Date 2017/3/7 .
 * @Time 16:23 .
 */
@Component
public class UserController {
    @Resource
    private UserService userService;

    // eg: http://localhost:8080/api/route/v1/getAllUsers
    @ApiService(method = RequestMethod.GET, auth = false, version = "v1")
    public ResultEntity getAllUsers(){
        ResultEntity resultEntity = new ResultEntity();
        List<User> userList = userService.findAll();

        resultEntity.setData(JsonUtil.list2Json(userList, new String[]{"worksFor", "ownDevices"}));
        resultEntity.setCode(200);
        resultEntity.setTimestamp(Calendar.getInstance().getTimeInMillis());

        return resultEntity;
    }
}
