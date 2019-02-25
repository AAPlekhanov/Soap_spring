package soapWebService;

import model.Document;
import model.Goods;
import soapWebService.exceptions.MyWebServiseException;

import javax.jws.WebService;

@WebService(serviceName = "SoapService")
public interface SoapSercice {


    String sayHelloTo(String text);

    Goods getGoods();

    Document getDocument();

    void sendGoods(Goods goods) throws MyWebServiseException;

    void sendDocument(Document document) throws MyWebServiseException;

    void getException(String text) throws MyWebServiseException;



}
