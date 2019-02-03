package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;
import soapWebService.SoapSercice;
import soapWebService.SoapServiceImpl;

@Configuration
public class MyWebConfig {


    @Bean
    public SoapSercice getSoapService() {
        return new SoapServiceImpl();
    }

    @Bean
    SimpleJaxWsServiceExporter exporter() {
        SimpleJaxWsServiceExporter exporter = new SimpleJaxWsServiceExporter();
        exporter.setBaseAddress("http://localhost:8890/");     // путь до wsdl  http://localhost:8890/SoapService?wsdl
        return exporter;
    }
}
