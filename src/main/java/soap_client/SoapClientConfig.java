package soap_client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import soapWebService.SoapSercice;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
public class SoapClientConfig {

    @Bean
    public JaxWsPortProxyFactoryBean getPortProxyFactoryBean() throws MalformedURLException {

        JaxWsPortProxyFactoryBean jaxWsPortProxyFactoryBean = new JaxWsPortProxyFactoryBean();
        jaxWsPortProxyFactoryBean.setWsdlDocumentUrl(new URL("http://localhost:8890/SoapService?wsdl"));
        jaxWsPortProxyFactoryBean.setServiceName("SoapService");
        jaxWsPortProxyFactoryBean.setServiceInterface(SoapSercice.class);
        // данные из wsdl
        jaxWsPortProxyFactoryBean.setNamespaceUri("http://soapWebService/"); // targetNamespace="http://soapWebService/"
        jaxWsPortProxyFactoryBean.setPortName("SoapServiceImplPort"); // port name="SoapServiceImplPort"

        return jaxWsPortProxyFactoryBean;
    }

}
