package io.nirahtech.ride4ever.apigateway.filters;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationFilter extends ZuulFilter {

    private final Logger logger = LoggerFactory.getLogger(AuthenticationFilter.class);
    
    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Override
    public Object run() throws ZuulException {
        HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        String requestedService = null;
        if (request.getContextPath().contains("/")) {
            if (request.getContextPath().startsWith("/")) {
                requestedService = request.getContextPath().split("/")[1];
            } else {
                requestedService = request.getContextPath().split("/")[0];
            }
        } else {
            requestedService = request.getContextPath();
        }

        if (requestedService.startsWith("ride4ever-microservice-")) {
            
        }
        return null;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public int filterOrder() {
        return 2;
    }

    @Override
    public String filterType() {
        return "pre";
    }
    
}
