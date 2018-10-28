package spring.service.imp;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import spring.dao.ILoginDao;
import spring.service.ILoginService;

/**
 * @author: HIAPAD
 * @date: 2018/10/14 19:19
 * @description:
 */
public class LoginService implements ILoginService {

    private ILoginDao loginDao;

    public ILoginDao getLoginDao() {
        return loginDao;
    }

    public void setLoginDao(ILoginDao loginDao) {
        this.loginDao = loginDao;
    }

    @Override
    public String add(String fdId) {
        System.out.println("service add 方法开始");
        //loginDao.add();
        System.out.println("service add 方法结束");
        return "add";
    }

    @Override
    public String loginCheck(String userName, String passWord) {
        return userName+"-"+passWord;
    }

    /**
     *
     * 功能描述: 测试非接口方法是否能被spring增加
     *
     * @param: []
     * @return: java.lang.String
     * @auther: HIAPAD
     * @date: 2018/10/13 23:20
     */
    public String isAppliedAdvisor(){
        System.out.println("service isAppliedAdvisor 方法开始");
        return "isAppliedAdvisor";
    }

    @Override
    public String delete(String fdId) {
        System.out.println("service delete 方法开始");
        loginDao.delete();
        System.out.println("service delete 方法结束");
        return "delete";
    }

    private String beanName;

    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println(this.beanName);
    }

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.toString());
        this.applicationContext = applicationContext;
    }

    public static String getInstance(){
        System.out.println("factory-method : getInstance" );
        return "instance";
    }
}
