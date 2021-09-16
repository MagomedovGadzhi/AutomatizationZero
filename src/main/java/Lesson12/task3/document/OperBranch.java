package Lesson12.task3.document;

import java.util.Objects;

public class OperBranch {
    private Branch branch;
    private Bank bank;

    public OperBranch(Branch branch, Bank bank) {
        this.branch = branch;
        this.bank = bank;
    }

    public Branch getBranch() {
        return branch;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperBranch that = (OperBranch) o;
        return Objects.equals(branch, that.branch) &&
                Objects.equals(bank, that.bank);
    }

    @Override
    public int hashCode() {
        int result = branch != null ? branch.hashCode() : 0;
        result = 31 * result + (bank != null ? bank.hashCode() : 0);
        return result;
    }
}