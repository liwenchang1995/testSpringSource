package spring.mvc.control;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.model.User;
import spring.util.IDGenerator;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: HIAPAD
 * @date: 2018/10/20 21:16
 * @description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static final Log logger = LogFactory.getLog(UserController.class);

    private static List<User> users = new ArrayList<User>();

    private static final String INDEX = "index";

    private static final String LOGIN = "login";

    private static final String REGISTER = "register";

    private static final String TEST_JSON = "testJson";

    @RequestMapping("/login")
    public String login(@RequestParam("loginName") String loginName,@RequestParam("password") String password){
        logger.info("验证登录名和密码!");
        for (User user : users){
            if (user.getFdLoginName().equals(loginName) &&
                    user.getFdPassword().equals(password)){
                    logger.info("验证成功!");
                return INDEX;
            }
        }
        return LOGIN;
    }

    @RequestMapping("/register")
    public String register(User user1,@RequestParam("fdLoginName") String loginName,@RequestParam("fdPassword") String password){
        System.out.println(user1.getFdLoginName());
        User user = new User();
        user.setFdId(IDGenerator.generate());
        user.setFdLoginName(loginName);
        user.setFdPassword(password);
        users.add(user);
        return LOGIN;
    }

    @RequestMapping("/registerForm")
    public String registerForm(){
        System.out.println("跳转到注册页面");
        return REGISTER;
    }

    @RequestMapping("/json")
    public void receiveJson(@RequestBody User user, HttpServletResponse response) throws Exception{
        user.setFdPassword("123");
        user.setFdName("hhhhh");
        ObjectMapper objectMapper = new ObjectMapper();
        String rtn = objectMapper.writeValueAsString(user);
        response.getWriter().write(rtn);
    }

    @RequestMapping("/testJson")
    public String testJson(){
        return TEST_JSON;
    }
}
