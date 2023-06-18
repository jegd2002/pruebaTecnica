//package com.pruebatecnica.bancolombia.webConfig;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//@Configuration
//@EnableWebSecurity
//public class securityConfig extends WebSecurityConfigurerAdapter{
//
//        @Autowired
//        private UserDetailsService userDetailsService;
//
//
//
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers(
//                        "/editar/**","/clean/**","/eliminarMovimiento/**","/edit/**","/editarMovimiento/**","/empleado/modificarEmpleado/**",
//                        "/eliminar/**","/guardar","/empresa/modificarEmpresa","/empresa/listaEmpresas","/movimientos/listaMovimientos"
//                        ,"/movimientos/modificarMovimiento"
//                )
//                .hasRole("ADMIN")
//                .antMatchers("/empleado/listaUsuarios/","/","/empresa/listaEmpresas","/movimientos/listaMovimientos")
//                .hasAnyRole("ADMIN","USER")
//                .and()
//                .formLogin()
//                .loginPage("/")
//                .and()
//                .exceptionHandling().accessDeniedPage("/errores/403")
//        ;
//    }

//}