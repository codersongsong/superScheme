import com.song.dao.TblUserTestMapper;
import com.song.model.TblUserTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @ClassName: springTest
 * @Description: (测试spring和mybatis的配置是否正确)
 * @Author: songzhengjie
 * @Date: 2017/7/20 16:30:16
 */

@RunWith(SpringJUnit4ClassRunner.class)//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:spring-mybatis.xml"})
//@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class springTest extends AbstractJUnit4SpringContextTests {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private TblUserTestMapper tblUserTestMapper;

//    @Before
//    public void loadSpringConfig() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//
//
//    }

    @Test
    public void test() {
        TblUserTest tblUserTest = tblUserTestMapper.selectByPrimaryKey(1);
        System.out.println(tblUserTest.getName());
    }

}
