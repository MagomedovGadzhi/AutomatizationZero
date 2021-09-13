package Lesson12.task1.helpers;

import Lesson12.task1.model.Generatable;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;

public class XmlHelper implements SerializeHelper {
    @Override
    public Generatable deserialize(String data, Class clazz) {
        XmlMapper mapper = new XmlMapper();
        try {
            return (Generatable) mapper.readValue(data, clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String serialize(Generatable object) {
        try {
            return new XmlMapper().writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Ошибка при серриализации объекта");
        }
    }
}