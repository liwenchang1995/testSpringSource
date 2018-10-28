package spring.mvc.control;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: HIAPAD
 * @date: 2018/10/20 11:38
 * @description:
 */
public class NoAnnotationControl implements Controller {
    /**
     * Process the request and return a ModelAndView object which the DispatcherServlet
     * will render. A {@code null} return value is not an error: It indicates that
     * this object completed request processing itself, thus there is no ModelAndView
     * to render.
     *
     * @param request  current HTTP request
     * @param response current HTTP response
     * @return a ModelAndView to render, or {@code null} if handled directly
     * @throws Exception in case of errors
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","hello world!");
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
