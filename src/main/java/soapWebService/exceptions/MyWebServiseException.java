package soapWebService.exceptions;

import javax.xml.ws.WebFault;

@WebFault
public class MyWebServiseException  extends Exception{ //создаём свой exception для передачи в ответе на клиент

    public MyWebServiseException(String message) {
        super(message);
    }
}
