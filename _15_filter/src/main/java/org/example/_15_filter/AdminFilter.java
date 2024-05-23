package example._15_filter;

import jakarta.servlet.*;

import java.io.IOException;

/**
 * @author YuHong
 * #Description AdminFilter
 * #Date: 2024/5/23 18:53
 */
public class AdminFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }
}
