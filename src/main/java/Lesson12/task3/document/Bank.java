package Lesson12.task3.document;

import java.util.Objects;

public class Bank {
    private Integer id;
    private Integer version;
    private String bic;
    private Object place;
    private Object name;
    private Object placeType;

    public Bank(Integer id, Integer version, String bic, Object place, Object name, Object placeType) {
        this.id = id;
        this.version = version;
        this.bic = bic;
        this.place = place;
        this.name = name;
        this.placeType = placeType;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public void setPlace(Object place) {
        this.place = place;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public void setPlaceType(Object placeType) {
        this.placeType = placeType;
    }

    public Integer getId() {
        return id;
    }

    public Integer getVersion() {
        return version;
    }

    public String getBic() {
        return bic;
    }

    public Object getPlace() {
        return place;
    }

    public Object getName() {
        return name;
    }

    public Object getPlaceType() {
        return placeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(id, bank.id) &&
                Objects.equals(version, bank.version) &&
                Objects.equals(bic, bank.bic) &&
                Objects.equals(place, bank.place) &&
                Objects.equals(name, bank.name) &&
                Objects.equals(placeType, bank.placeType);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (bic != null ? bic.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (placeType != null ? placeType.hashCode() : 0);
        return result;
    }
}