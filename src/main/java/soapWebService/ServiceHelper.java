package soapWebService;

import soapWebService.annotations.ExceptionMessage;
import soapWebService.exceptions.MyWebServiseException;

import javax.xml.bind.annotation.XmlElement;
import java.lang.reflect.Field;

public class ServiceHelper {

    /**
     * Метод для проверки заполненности полей в передаваемых объектах вебсервиса
     * @param object объект для проверки
     * @param clazz класс объекта для проверки
     * @throws MyWebServiseException
     */
    public static void validateValues(Object object, Class<?> clazz) throws MyWebServiseException {
        if (object == null) {
            if (clazz.isAnnotationPresent(ExceptionMessage.class)) {
                throw new MyWebServiseException(clazz.getAnnotation(ExceptionMessage.class).message());
            }
        }

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(ExceptionMessage.class)) {
                field.setAccessible(true);
                try {
                    if (field.getAnnotation(XmlElement.class).required()
                            && (field.get(object) == null || field.get(object).equals("")) || field.get(object).equals(0)) {
                        throw new MyWebServiseException(field.getAnnotation(ExceptionMessage.class).message());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
