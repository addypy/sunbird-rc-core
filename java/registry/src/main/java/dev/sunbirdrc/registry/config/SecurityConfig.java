package dev.sunbirdrc.registry.config;

import dev.sunbirdrc.registry.util.DefinitionsManager;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.keycloak.adapters.springsecurity.KeycloakSecurityComponents;
import org.keycloak.adapters.springsecurity.authentication.KeycloakAuthenticationProvider;
import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.authority.mapping.SimpleAuthorityMapper;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;
import org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter;

// Security configuration class for the application
@Configuration
@EnableWebSecurity
@ComponentScan(basePackageClasses = KeycloakSecurityComponents.class)
@ConditionalOnProperty(name = "authentication.enabled", havingValue = "true", matchIfMissing = false)
public class SecurityConfig extends KeycloakWebSecurityConfigurerAdapter {

    @Value("${authentication.enabled:true}")
    boolean authenticationEnabled;

    @Autowired
    private SchemaFilter schemaFilter;

    // Configure the global authentication manager with Keycloak authentication provider
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        KeycloakAuthenticationProvider keycloakAuthenticationProvider = keycloakAuthenticationProvider();
        keycloakAuthenticationProvider.setGrantedAuthoritiesMapper(
                new SimpleAuthorityMapper());
        auth.authenticationProvider(keycloakAuthenticationProvider);
    }

    // Configure Keycloak configuration resolver
    @Bean
    public KeycloakSpringBootConfigResolver KeycloakConfigResolver() {
        return new KeycloakSpringBootConfigResolver();
    }

    // Configure session authentication strategy
    @Bean
    @Override
    protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
        return new RegisterSessionAuthenticationStrategy(
                new SessionRegistryImpl());
    }

    // Configure HTTP security settings
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
        HttpSecurity httpConfig = http.csrf().disable();

        // If authentication is enabled, configure the allowed paths and require authentication for other paths
        if (authenticationEnabled) {
            httpConfig.authorizeRequests()
                    .antMatchers("/**/invite", "/health", "/error",
                            "/_schemas/**", "/**/templates/**", "/**/*.json", "/**/verify",
                            "/swagger-ui", "/**/search", "/**/attestation/**",
                            "/api/docs/swagger.json", "/api/docs/*.json", "/plugin/**", "/swagger-ui.html")
                    .permitAll()
                    .and()
                    .addFilterBefore(schemaFilter, WebAsyncManagerIntegrationFilter.class)
                    .authorizeRequests()
                    .anyRequest()
                    .authenticated();
        } else {
            // If authentication is disabled, allow all requests
            httpConfig.authorizeRequests()
                    .anyRequest()
                    .permitAll();
        }
    }
}