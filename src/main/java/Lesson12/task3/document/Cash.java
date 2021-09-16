package Lesson12.task3.document;

import java.util.Objects;

public class Cash {
    private Object id;
    private Object version;
    private Object currencyNumericCodeIso;
    private Double nominal;
    private String description;
    private Boolean isCoin;

    public Cash(Object id, Object version, Object currencyNumericCodeIso, Double nominal, String description, Boolean isCoin) {
        this.id = id;
        this.version = version;
        this.currencyNumericCodeIso = currencyNumericCodeIso;
        this.nominal = nominal;
        this.description = description;
        this.isCoin = isCoin;
    }

    public Object getId() {
        return id;
    }

    public Object getVersion() {
        return version;
    }

    public Object getCurrencyNumericCodeIso() {
        return currencyNumericCodeIso;
    }

    public Double getNominal() {
        return nominal;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getCoin() {
        return isCoin;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public void setCurrencyNumericCodeIso(Object currencyNumericCodeIso) {
        this.currencyNumericCodeIso = currencyNumericCodeIso;
    }

    public void setNominal(Double nominal) {
        this.nominal = nominal;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCoin(Boolean coin) {
        isCoin = coin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cash cash = (Cash) o;
        return Objects.equals(id, cash.id) &&
                Objects.equals(version, cash.version) &&
                Objects.equals(currencyNumericCodeIso, cash.currencyNumericCodeIso) &&
                Objects.equals(nominal, cash.nominal) &&
                Objects.equals(description, cash.description) &&
                Objects.equals(isCoin, cash.isCoin);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (currencyNumericCodeIso != null ? currencyNumericCodeIso.hashCode() : 0);
        result = 31 * result + (nominal != null ? nominal.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isCoin != null ? isCoin.hashCode() : 0);
        return result;
    }
}
