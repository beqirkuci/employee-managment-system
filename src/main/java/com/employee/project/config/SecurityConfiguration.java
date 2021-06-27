package com.employee.project.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/**").permitAll()
             //.antMatchers(HttpMethod.POST,"/api/doc").permitAll()
           // .antMatchers("/showNewEmployeeForm").authenticated()
           // .antMatchers(HttpMethod.POST, "/api/orders").authenticated()

            .and()
            .formLogin()
            .and()
            .httpBasic()
            .and()
            .logout()
            .and();
           // .headers().frameOptions().disable()
           // .and()
           // .csrf().disable();
    }
}



