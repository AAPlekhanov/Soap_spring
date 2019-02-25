package soap_client;

import model.Goods;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import soapWebService.SoapSercice;
import soapWebService.exceptions.MyWebServiseException;

public class SoapClient {
    // тестовые запросы к soap сервису
    public static void main(String[] args) throws MyWebServiseException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
        SoapSercice bean = context.getBean(SoapSercice.class);
        System.out.println(bean.getDocument());
        System.out.println(bean.getGoods());
        System.out.println(bean.sayHelloTo("test text"));
        bean.sendGoods(new Goods(5, "cement"));

    }

}
