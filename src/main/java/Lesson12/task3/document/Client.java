package Lesson12.task3.document;

import java.util.Objects;

public class Client {
    private Integer id;
    private Integer version;
    private String inn;
    private String shortName;
    private String ogrn;

    public Client(Integer id, Integer version, String inn, String shortName, String ogrn) {
        this.id = id;
        this.version = version;
        this.inn = inn;
        this.shortName = shortName;
        this.ogrn = ogrn;
    }

    public Integer getId() {
        return id;
    }

    public Integer getVersion() {
        return version;
    }

    public String getInn() {
        return inn;
    }

    public String getShortName() {
        return shortName;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
                Objects.equals(version, client.version) &&
                Objects.equals(inn, client.inn) &&
                Objects.equals(shortName, client.shortName) &&
                Objects.equals(ogrn, client.ogrn);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (ogrn != null ? ogrn.hashCode() : 0);
        return result;
    }
}