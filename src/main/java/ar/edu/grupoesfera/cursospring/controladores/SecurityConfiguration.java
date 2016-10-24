package ar.edu.grupoesfera.cursospring.controladores;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.edu.grupoesfera.cursospring.modelo.Persona;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@RequestMapping(method = RequestMethod.GET)
	public String testMestod(HttpServletRequest request){
	   Persona person = (Persona)request.getSession().getAttribute("email");
	   return "testJ";
	}
	
    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.inMemoryAuthentication().withUser("admin@gmail.com").password("admin1234")
                .roles("USER", "ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/iniciar").permitAll()
                .antMatchers("/", "/*vista*/**").access("hasRole('USER')").and()
                .formLogin().loginPage("/iniciarSesion").usernameParameter("email").passwordParameter("password");
    }
    
}
