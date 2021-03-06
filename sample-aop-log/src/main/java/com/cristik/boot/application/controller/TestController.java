package com.cristik.boot.application.controller;

import com.cristik.boot.application.aspect.IgnoreLog;
import com.cristik.boot.application.entity.User;
import com.cristik.boot.application.service.ITestService;
import com.cristik.common.utils.MessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cristik
 */

@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ITestService testService;

    /**
     * AOP匹配方法
     * @param userName
     * @param score
     * @return
     */
    @GetMapping("/test")
    public String test(String userName,Integer score) {
        return MessageUtil.success(testService.test(userName, score));
    }

    /**
     * AOP忽略特定注解
     * @param userName
     * @param score
     * @return
     */
    @IgnoreLog
    @GetMapping("/test/ignore")
    public String ignoreLog(String userName,Integer score) {
        return MessageUtil.success(testService.test(userName, score));
    }

    /**
     * AOP匹配bindRequest
     * @param user
     * @param bindingResult
     * @return
     */
    @PostMapping("/test/ignore")
    public String testBindRequest(@RequestBody User user, BindingResult bindingResult) {
        return MessageUtil.success(testService.test(user.getUserName(), user.getScore()));
    }

}
