package spring.mvc.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: HIAPAD
 * @date: 2018/10/14 22:30
 * @description:
 */
@Controller
@RequestMapping("/mvc")
public class Control {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
