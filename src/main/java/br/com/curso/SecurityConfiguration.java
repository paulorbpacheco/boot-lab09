package br.com.curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

/**
 * Created by paulo on 6/12/17.
 */
@Configuration
public class SecurityConfiguration {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("barry").password("t0ps3cr3t").roles("USER");
    }
}
