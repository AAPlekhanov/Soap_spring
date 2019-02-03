package config;




import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;

import javax.servlet.ServletRegistration;

/**
 * инициализация Spring MVC через аннотации ( Файлов dispatcher-servlet.xml и web.xml не должно быть чтобы не было конфликтов)
 * аналог web.xml
 */



public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }


    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class<?>[]{
                MyWebConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}