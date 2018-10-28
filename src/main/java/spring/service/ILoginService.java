package spring.service;

/**
 * @author: HIAPAD
 * @date: 2018/10/14 19:17
 * @description:
 */
public interface ILoginService {
    String loginCheck(String userName, String passWord);

    String add(String fdId);

    String delete(String fdId);
}
