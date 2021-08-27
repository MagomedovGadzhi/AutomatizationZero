package lesson8.task4;

import java.util.Objects;

public class Branch extends Entity {
    private String address;

    public Branch(String name, String address) {
        super(name);
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Branch branch = (Branch) o;
        return Objects.equals(address, branch.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), address);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "address='" + address + '\'' +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}