package com.song.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName: testMainController
 * @Description: (first web controller test class)
 * @Author: songzhengjie
 * @Date: 2017/7/17 11:42:25
 */
@Controller
@RequestMapping("/testmain")
public class testMainController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     *
     * @param paramsStr
     * @return
     */
    @RequestMapping("/monitor")
    public String home(String paramsStr){

        System.out.println("hello,world! I`m in!!!");
        for (int i = 0; i < 6; i++) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            Map map = new HashMap();
            System.out.println("对象创建测试"+new Date().getMinutes()+":"+i);
            logger.info("对象创建日志输出{0}:",i);
            logger.info("对象创建日志输出(占位){}:",i);
        }
        return "testmain/monitor";
    }

}
