package dev.sunbirdrc.registry.config;

import dev.sunbirdrc.registry.util.IDefinitionsManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

// This class is a filter that checks if the incoming request is for an invite or manage role
// and forwards the request to the appropriate servlet path.
@Component
public class SchemaFilter implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(SchemaFilter.class);
    private static final String INVITE_URL_ENDPOINT = "/invite";

    // Autowire the definitions manager to access entity roles
    @Autowired
    private IDefinitionsManager definitionsManager;

    // This method filters the incoming requests and forwards them to the appropriate servlet path
    // based on the invite or manage role.
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        try {
            // Check if the request is for an invite role and forward it to the appropriate servlet path
            if (request.getRequestURI().contains(INVITE_URL_ENDPOINT) &&
                    definitionsManager.getEntitiesWithAnonymousInviteRoles().stream().anyMatch(request.getRequestURI()::contains)) {
                servletRequest.getRequestDispatcher(((HttpServletRequest) servletRequest).getServletPath()).forward(servletRequest, servletResponse);
                return;
            } 
            // Check if the request is for a manage role and forward it to the appropriate servlet path
            else if (definitionsManager.getEntitiesWithAnonymousManageRoles().stream().anyMatch(request.getRequestURI()::contains)) {
                servletRequest.getRequestDispatcher(((HttpServletRequest) servletRequest).getServletPath()).forward(servletRequest, servletResponse);
                return;
            }
            // If the request is not for an invite or manage role, continue with the filter chain
            filterChain.doFilter(servletRequest, servletResponse);
        } catch (Exception e) {
            logger.error("Exception while applying security filters: ", e);
            throw e;
        }
    }
}