package test.lesson11.task2;

import lesson11.task2.Human;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HumanAgeTest {
    @Test
    @DisplayName("Проверка корркетного возраста = 0")
    public void testSetHumanPositiveAge0(){
        Human human = new Human();
        human.setAge(0);
        Assertions.assertEquals(0, human.getAge());
    }

    @Test
    @DisplayName("Проверка корркетного возраста = 60")
    public void testSetHumanPositiveAge60(){
        Human human = new Human();
        human.setAge(60);
        Assertions.assertEquals(60, human.getAge());
    }

    @Test
    @DisplayName("Проверка корркетного возраста = 120")
    public void testSetHumanPositiveAge120(){
        Human human = new Human();
        human.setAge(120);
        Assertions.assertEquals(120, human.getAge());
    }

    @Test
    @DisplayName("Проверка НЕкорркетного возраста = -1")
    public void testSetHumanNegativeAgeMinus1(){
        Human human = new Human();
        try {
            human.setAge(-1);
            Assertions.fail();
        } catch (IllegalArgumentException e){
            Assertions.assertEquals("Некорректный возраст: -1", e.getMessage());
            Assertions.assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    @DisplayName("Проверка НЕкорркетного возраста = 121")
    public void testSetHumanNegativeAge121(){
        Human human = new Human();
        try {
            human.setAge(121);
            Assertions.fail();
        } catch (IllegalArgumentException e){
            Assertions.assertEquals("Некорректный возраст: 121", e.getMessage());
            Assertions.assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }
}