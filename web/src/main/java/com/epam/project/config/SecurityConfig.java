package com.epam.project.config;

import com.epam.project.service.security.PersonAuthenticationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *  * The SecurityConfiguration class provides a centralized location for
 * application security configuration. This class bootstraps the Spring Security
 * components during application startup.
 *
 * Created by Aliaksandr_Khmurchyk on 14-Feb-18.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    /**
     * The PersonAuthenticationProvider security component.
     */
    @Autowired
    private PersonAuthenticationProvider personAuthenticationProvider;

    /**
     * Supplies a PasswordEncoder instance to the Spring ApplicationContext. The
     * PasswordEncoder is used by the AuthenticationProvider to perform one-way
     * hash operations on passwords for credential comparison.
     *
     * @return A PasswordEncoder.
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * This method builds the AuthenticationProvider used by the system to
     * process authentication requests.
     *
     * @param auth An AuthenticationManagerBuilder instance used to construct
     *        the AuthenticationProvider.
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(personAuthenticationProvider);
    }

    /**
     * This inner class configures a WebSecurityConfigurerAdapter instance for
     * the web service API context paths.
     *
     * @author Aliaksandr_Khmurchyk
     */
    @Configuration
    @Order(1)
    public static class ApiWebSecurityConfigurerAdapter
            extends WebSecurityConfigurerAdapter {



    }

}
