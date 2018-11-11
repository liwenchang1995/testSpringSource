package mybatis.dao;

import mybatis.entity.Person;

/**
 * @author: HIAPAD
 * @date: 2018/11/8 23:52
 * @description:
 */
public interface PersonMapper {
    Person selectPerson(String id);

    Person selectPersonByName(String name);

    void insertPerson(Person person);

    void updatePerson(Person person);

    void deletePerson(Person person);
}
