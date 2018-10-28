package spring.dao.imp;

import spring.dao.ILoginDao;

/**
 * @author: HIAPAD
 * @date: 2018/10/14 19:22
 * @description:
 */
public class LoginDao implements ILoginDao {
    @Override
    public void add() {
        System.out.println("dao add方法开始");
        System.out.println("add add");
        System.out.println("dao 方法结束");
    }

    @Override
    public void delete() {
        System.out.println("dao delete方法开始");
        System.out.println("delete delete");
        System.out.println("delete 方法结束");
    }

    /**
     *
     * 功能描述:
     *
     * @param: [fdId]
     * @return: java.lang.String
     * @auther: HIAPAD
     * @date: 2018/10/13 13:09
     */
    public String get(String fdId){
        return "aa";
    }
}
