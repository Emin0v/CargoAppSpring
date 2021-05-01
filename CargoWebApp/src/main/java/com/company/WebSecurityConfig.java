package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    @Qualifier("userDetailsService")
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       auth
               .userDetailsService(userDetailsService)
               .passwordEncoder(passwordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http
               .authorizeRequests().antMatchers("/login**").permitAll()
               .and()
               .authorizeRequests().antMatchers("/register").permitAll()
               .and()
               .authorizeRequests().antMatchers("/").permitAll()
               .and()
               .authorizeRequests().antMatchers("/order").hasAnyAuthority("ADMIN","USER")
               .and()
               .authorizeRequests().antMatchers("/profile").hasAnyAuthority("ADMIN","USER")
               .and()
               .authorizeRequests().antMatchers("../resources/**","/static/**").permitAll()
               .and()
               .authorizeRequests().anyRequest().permitAll()
               .and()
               .formLogin()
               .loginPage("/login")
               .defaultSuccessUrl("/index")
               .permitAll()
               .and()
               .logout().logoutSuccessUrl("/login").permitAll()
               .and().csrf().disable();

    }
}
