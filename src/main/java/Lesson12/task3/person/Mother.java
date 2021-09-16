package Lesson12.task3.person;

import java.util.Objects;

public class Mother {
    private String name;
    private Integer age;

    public Mother(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Mother() {
    }

    public String getName() {
        return name;
    }

    public Mother setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Mother setAge(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mother mother = (Mother) o;
        return Objects.equals(name, mother.name) &&
                Objects.equals(age, mother.age);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}