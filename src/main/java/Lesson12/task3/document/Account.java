package Lesson12.task3.document;

import java.util.Objects;

public class Account {
    private Integer id;
    private Integer version;
    private String accountNumber;
    private String bic;
    private Branch branch;

    public Account(Integer id, Integer version, String accountNumber, String bic, Branch branch) {
        this.id = id;
        this.version = version;
        this.accountNumber = accountNumber;
        this.bic = bic;
        this.branch = branch;
    }

    public Integer getId() {
        return id;
    }

    public Integer getVersion() {
        return version;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBic() {
        return bic;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) &&
                Objects.equals(version, account.version) &&
                Objects.equals(accountNumber, account.accountNumber) &&
                Objects.equals(bic, account.bic) &&
                Objects.equals(branch, account.branch);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (accountNumber != null ? accountNumber.hashCode() : 0);
        result = 31 * result + (bic != null ? bic.hashCode() : 0);
        result = 31 * result + (branch != null ? branch.hashCode() : 0);
        return result;
    }
}