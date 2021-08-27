package lesson8.task4;

import java.util.Objects;

public abstract class Entity implements Validatable {
    protected String uuid;
    protected String name;

    public Entity(String name) {
        this.name = name;
        this.uuid = null;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public void validate() {
        ValidatorStub.validateEntity(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(name, entity.name);
    }

    @Override
    public int hashCode() {
        return 31 + Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Entity{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}