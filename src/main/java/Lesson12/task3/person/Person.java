package Lesson12.task3.person;

import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private Integer age;
    private Mother mother;
    private List<String> children;
    private Boolean married;
    private Object dog;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Mother getMother() {
        return mother;
    }

    public Person setMother(Mother mother) {
        this.mother = mother;
        return this;
    }

    public List<String> getChildren() {
        return children;
    }

    public Person setChildren(List<String> children) {
        this.children = children;
        return this;
    }

    public Boolean getMarried() {
        return married;
    }

    public Person setMarried(Boolean married) {
        this.married = married;
        return this;
    }

    public Object getDog() {
        return dog;
    }

    public Person setDog(Object dog) {
        this.dog = dog;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age) &&
                Objects.equals(mother, person.mother) &&
                Objects.equals(children, person.children) &&
                Objects.equals(married, person.married) &&
                Objects.equals(dog, person.dog);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (mother != null ? mother.hashCode() : 0);
        result = 31 * result + (children != null ? children.hashCode() : 0);
        result = 31 * result + (married != null ? married.hashCode() : 0);
        result = 31 * result + (dog != null ? dog.hashCode() : 0);
        return result;
    }
}