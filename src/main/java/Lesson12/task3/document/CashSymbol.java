package Lesson12.task3.document;

import java.util.Objects;

public class CashSymbol {
    private Integer id;
    private Object version;
    private String code;
    private String name;
    private Object isExpense;
    private Object weight;

    public CashSymbol(Integer id, Object version, String code, String name, Object isExpense, Object weight) {
        this.id = id;
        this.version = version;
        this.code = code;
        this.name = name;
        this.isExpense = isExpense;
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public Object getVersion() {
        return version;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Object getExpense() {
        return isExpense;
    }

    public Object getWeight() {
        return weight;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsExpense(Object isExpense) {
        this.isExpense = isExpense;
    }

    public void setWeight(Object weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CashSymbol that = (CashSymbol) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(version, that.version) &&
                Objects.equals(code, that.code) &&
                Objects.equals(name, that.name) &&
                Objects.equals(isExpense, that.isExpense) &&
                Objects.equals(weight, that.weight);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isExpense != null ? isExpense.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        return result;
    }
}
