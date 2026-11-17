package com.crud.pessoa.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable())

                .authorizeHttpRequests(auth -> auth

                        // Permitir requisições GET
                        .requestMatchers(HttpMethod.GET, "/**").permitAll()

                        // Permitir requisições POST
                        .requestMatchers(HttpMethod.POST, "/**").permitAll()

                        // Permitir requisições PUT
                        .requestMatchers(HttpMethod.PUT, "/**").permitAll()

                        // Permitir requisições DELETE
                        .requestMatchers(HttpMethod.DELETE, "/**").permitAll()

                        // Bloquear qualquer outra requisição
                        .anyRequest().denyAll()
                );

        return http.build();
    }
}