package team.odds.accountservice.filters;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(1)
public class MyFilter implements Filter {
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        System.out.println("Logging Request " + req.getMethod() + ": " + req.getRequestURI());
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Logging Response " + res.getStatus() + ": " + res.getContentType());
    }
}
