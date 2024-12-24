
package com.module_project.service1_ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()).authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
             .formLogin(login -> login.disable())   
                .formLogin(login -> login.disable()) // Désactiver la page de login
            .httpBasic(basic -> basic.disable());
// Désactiver CSRF (utile pour POST, PUT, DELETE)
            /*.authorizeRequests(auth -> auth.anyRequest().permitAll()) // Autoriser toutes les requêtes
            .formLogin(login -> login.disable()) // Désactiver la page de login
            .httpBasic(basic -> basic.disable()); // Désactiver l'authentification basique*/

        return http.build();
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // Utilisation de BCrypt pour le hachage
    }
    
}
