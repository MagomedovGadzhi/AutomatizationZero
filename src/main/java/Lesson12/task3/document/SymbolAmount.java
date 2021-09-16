package Lesson12.task3.document;

import java.util.Objects;

public class SymbolAmount {
    private String amount;
    private CashSymbol cashSymbol;

    public SymbolAmount(String amount, CashSymbol cashSymbol) {
        this.amount = amount;
        this.cashSymbol = cashSymbol;
    }

    public SymbolAmount() {
    }

    public String getAmount() {
        return amount;
    }

    public CashSymbol getCashSymbol() {
        return cashSymbol;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setCashSymbol(CashSymbol cashSymbol) {
        this.cashSymbol = cashSymbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SymbolAmount that = (SymbolAmount) o;
        return Objects.equals(amount, that.amount) &&
                Objects.equals(cashSymbol, that.cashSymbol);
    }

    @Override
    public int hashCode() {
        int result = amount != null ? amount.hashCode() : 0;
        result = 31 * result + (cashSymbol != null ? cashSymbol.hashCode() : 0);
        return result;
    }
}