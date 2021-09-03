package test.lesson11.task2;

import lesson11.task2.Human;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HumanFirstnameTest {
    @Test
    @DisplayName("Проверка корркетного имени = Иван")
    public void testSetHumanPositiveFirstname(){
        Human human = new Human();
        human.setFirstName("Иван");
        Assertions.assertEquals("Иван", human.getFirstName());
    }

    @Test
    @DisplayName("Проверка НЕкорркетного имени = Ив")
    public void testSetHumanNegativeFirstname1(){
        Human human = new Human();
        try {
            human.setFirstName("Ив");
            Assertions.fail();
        } catch (IllegalArgumentException e){
            Assertions.assertEquals("Некорректное имя: Ив", e.getMessage());
            Assertions.assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    @DisplayName("Проверка НЕкорркетного имени = Ивансдлиннымименем")
    public void testSetHumanNegativeFirstname2(){
        Human human = new Human();
        try {
            human.setFirstName("Ивансдлиннымименем");
            Assertions.fail();
        } catch (IllegalArgumentException e){
            Assertions.assertEquals("Некорректное имя: Ивансдлиннымименем", e.getMessage());
            Assertions.assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    @DisplayName("Проверка НЕкорркетного имени = Иван5аа")
    public void testSetHumanNegativeFirstname3(){
        Human human = new Human();
        try {
            human.setFirstName("Иван5аа");
            Assertions.fail();
        } catch (IllegalArgumentException e){
            Assertions.assertEquals("Некорректное имя: Иван5аа", e.getMessage());
            Assertions.assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }
}