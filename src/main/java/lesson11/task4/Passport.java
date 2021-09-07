package lesson11.task4;

import java.util.Objects;

public class Passport {
    private Integer series;

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    private Integer number;

    public Passport(Integer series, Integer number) {
        this.series = series;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "series=" + series +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passport passport = (Passport) o;

        if (!Objects.equals(series, passport.series)) return false;
        return Objects.equals(number, passport.number);
    }

    @Override
    public int hashCode() {
        int result = series != null ? series.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }
}