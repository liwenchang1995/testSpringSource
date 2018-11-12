package mybatis;

import mybatis.dao.PersonMapper;
import mybatis.entity.Person;
import mybatis.util.MyBatisUtil;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.UUID;


/**
 * @author: HIAPAD
 * @date: 2018/11/9 23:18
 * @description:
 */
public class MybatisTest {
    private static SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    @BeforeClass
    public static void init() throws IOException {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        System.out.println(sqlSessionFactory);
    }

    @Before
    public void before() {
        //自动提交
        sqlSession = sqlSessionFactory.openSession(true);
    }

    @After
    public void after() {
        sqlSession.close();
    }

    @Test
    public void testMyBatisUtils() {
    }

    @Test
    public void testInsert() {
        Person person = new Person();
        person.setFdId(UUID.randomUUID().toString());
        person.setFdName("liwenchang");
        person.setFdPhoneNumber("18814128089");
        sqlSession.insert("insertPerson", person);
        Configuration configuration = sqlSession.getConfiguration();
        System.out.println(configuration);

//        Person s = sqlSession.selectOne("selectPersonByName", person.getFdName());
//        sqlSession.delete("deletePerson", s);
    }

    @Test
    public void testSelectOne(){
        Person person = sqlSession.selectOne("selectPerson", "e0bf7232-6412-49be-b832-e6bac7f19828");
        System.out.println(person.getFdName());
    }

    @Test
    public void testUpdate() {
        Person person = new Person();
        person.setFdId(UUID.randomUUID().toString());
        person.setFdName("dashixiong");
        person.setFdPhoneNumber("16614126666");
        sqlSession.insert("insertPerson", person);
        person = sqlSession.selectOne("selectPersonByName", person.getFdName());
        sqlSession.update("updatePerson", person);
        Person s = sqlSession.selectOne("selectPersonByName", person.getFdName());
        System.out.println(s);
        sqlSession.delete("deletePerson", s);
    }

    @Test
    public void testPersonMapper(){
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
        Person person = personMapper.selectPerson("e0bf7232-6412-49be-b832-e6bac7f19828");
        System.out.println("person fdName= " + person.getFdName());
        System.out.println("person fdPhoneNumber= " + person.getFdPhoneNumber());
    }
}
