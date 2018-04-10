package com.sdl.webapp.common.impl.interceptor;

import com.sdl.webapp.common.api.ThreadLocalManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.DispatcherType;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>ThreadLocalInterceptor class.</p>
 */
public class ThreadLocalInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private ThreadLocalManager threadLocalManager;

    /**
     * {@inheritDoc}
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        if (request.getDispatcherType() != DispatcherType.INCLUDE) {
            this.threadLocalManager.clearAll();
        }
    }
}


