package soapWebService;

import model.Document;
import model.Goods;

import javax.jws.WebService;

@WebService(serviceName = "SoapService")
public interface SoapSercice {


    String sayHelloTo(String text);

    Goods getGoods();

    Document getDocument();

    void sendGoods(Goods goods);

    void sendDocument(Document document);



}
