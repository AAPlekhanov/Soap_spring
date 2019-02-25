package model;

import soapWebService.annotations.ExceptionMessage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;


@XmlRootElement(name = "document")
@XmlAccessorType(XmlAccessType.FIELD)
public class Document implements Serializable{

    @XmlElement(required = true)
    @ExceptionMessage(message = "id документа не задан")
    private int id;

    @XmlElement(required = true)
    @ExceptionMessage(message = "name незадано")
    private String name;

    @XmlElement(required = true)
    @ExceptionMessage(message = "List<Goods> не задан")
    private List<Goods> goodsList;

    public Document() {
    }

    public Document(int id, String name, List<Goods> goodsList) {
        this.id = id;
        this.name = name;
        this.goodsList = goodsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        return "Document{" +
                "goodsList=" + goodsList +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
