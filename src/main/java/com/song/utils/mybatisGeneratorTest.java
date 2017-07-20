package com.song.utils;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: mybatisGeneratorTest
 * @Description: (自动生成dao)
 * @Author: songzhengjie
 * @Date: 2017/7/20 14:57:21
 */
public class mybatisGeneratorTest {


    public static void main(String[] args) {
        try {
            List warnings = new ArrayList();
            boolean overwrite = true;
            ConfigurationParser cp = new ConfigurationParser(warnings);

            Configuration config = cp.parseConfiguration(ClassLoader.getSystemResourceAsStream("generatorConfig.xml"));

            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
            System.out.println("生成结束！时间:" + new Date());
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
