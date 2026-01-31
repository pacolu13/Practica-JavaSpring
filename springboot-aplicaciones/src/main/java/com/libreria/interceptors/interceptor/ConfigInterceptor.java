package com.libreria.interceptors.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class ConfigInterceptor implements WebMvcConfigurer {

    @Autowired //Inyeccion de dependencias de forma automatica, investigar
    private LogInterceptor interceptor;

    @Override //Que es webMVC?
    public void addInterceptors(InterceptorRegistry registry){
        // /** = el interceptor esta implicito en todas las rutas
        registry.addInterceptor(interceptor).addPathPatterns("/**");
    }
    
}
