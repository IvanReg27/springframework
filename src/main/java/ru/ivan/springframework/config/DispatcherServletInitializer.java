package ru.ivan.springframework.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0]; // Or include your root configuration classes
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class}; // Include your configuration class
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; // Map requests to the DispatcherServlet
    }
}
