package mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: HIAPAD
 * @date: 2018/11/8 23:43
 * @description: mybatis工具类
 */
public class MyBatisUtil {
    private static volatile SqlSessionFactory sqlSessionFactory;

    public static final String MyBatisConfigLocation = "mybatisConfig.xml";

    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        if (sqlSessionFactory == null) {
            synchronized (MyBatisUtil.class) {
                if (sqlSessionFactory == null) {
                    InputStream input = Resources.getResourceAsStream(MyBatisConfigLocation);
                    sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
                    input.close();
                }
            }
        }
        return sqlSessionFactory;
    }
}
