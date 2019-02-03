package soap_client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import soapWebService.SoapSercice;

public class SoapClient {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
        SoapSercice bean = context.getBean(SoapSercice.class);
        System.out.println(bean.getDocument());
        System.out.println(bean.getGoods());
        System.out.println(bean.sayHelloTo("test text"));

    }

}
