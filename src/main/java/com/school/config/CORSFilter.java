package com.school.config;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CORSFilter implements Filter {

    public CORSFilter(){

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletResponse res= (HttpServletResponse) response;
        HttpServletRequest req= (HttpServletRequest) request;

        res.setHeader("Access-Control-Allow-Origin","*");
        res.setHeader("Access-Control-Allow-Methods","POST, GET, OPTIONS, DELETE, PUT, PATCH");
        res.setHeader("Access-Control-Max-Age","3600");
        res.setHeader("Access-Control-Allow-Headers","x-requested-with, authorization, x-auth-token, origin, content-type, accept, UserEmail");

        if("OPTIONS".equalsIgnoreCase(req.getMethod())){
            res.setStatus(HttpServletResponse.SC_OK);
        }else {
            chain.doFilter(request,response);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
