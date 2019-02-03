package soapWebService;


import model.Document;
import model.Goods;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "SoapService")
@Component
public class SoapServiceImpl implements SoapSercice {


    @Override
    public String sayHelloTo(String text) {
        return "Hello to " + text;
    }


    @Override
    public Goods getGoods() {
        return new Goods(1,"woods");
    }

    @Override
    public Document getDocument() {

        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods(2,"lumber"));
        goodsList.add(new Goods(3,"concrete"));

        return new Document(101,"Building materials", goodsList);
    }

    @Override
    public void sendGoods(Goods goods) {
        System.out.println(goods);
    }

    @Override
    public void sendDocument(Document document) {
        System.out.println(document);
    }


}
