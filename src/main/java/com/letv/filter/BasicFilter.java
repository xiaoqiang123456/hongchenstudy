package com.letv.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dell on 2017/5/17.
 */
public class BasicFilter  implements Filter{
    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse, FilterChain filterchain)
            throws IOException, ServletException {

        HttpServletResponse response = (HttpServletResponse) servletResponse;
//  HttpServletRequest request = (HttpServletRequest) servletRequest;
//  HttpSession session = request.getSession();


// 指定允许其他域名访问

        response.addHeader("Access-Control-Allow-Origin", "*");

        // 响应类型  响应方法

        response.addHeader("Access-Control-Allow-Methods", "POST, OPTIONS");

        // 响应头设置

        response.addHeader("Access-Control-Allow-Headers", "POWERED-BY-FANTONG");

        response.addHeader("Access-Control-Max-Age", "30");


        // 需要过滤的代码
        filterchain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }
}
