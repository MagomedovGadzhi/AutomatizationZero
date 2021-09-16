package Lesson12.task3.document;

import java.util.List;
import java.util.Objects;

public class Branch {
    private Integer id;
    private Integer version;
    private Object headBranch;
    private Object bic;
    private String shortName;
    private String timeZone;
    private List<Object> branchAddresses;
    private Boolean currencyTrifle;
    private String code_TFU;

    public Branch(Integer id, Integer version, Object headBranch, Object bic, String shortName, String timeZone, List<Object> branchAddresses, Boolean currencyTrifle, String code_TFU) {
        this.id = id;
        this.version = version;
        this.headBranch = headBranch;
        this.bic = bic;
        this.shortName = shortName;
        this.timeZone = timeZone;
        this.branchAddresses = branchAddresses;
        this.currencyTrifle = currencyTrifle;
        this.code_TFU = code_TFU;
    }

    public Integer getId() {
        return id;
    }

    public Integer getVersion() {
        return version;
    }

    public Object getHeadBranch() {
        return headBranch;
    }

    public Object getBic() {
        return bic;
    }

    public String getShortName() {
        return shortName;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public List<Object> getBranchAddresses() {
        return branchAddresses;
    }

    public Boolean getCurrencyTrifle() {
        return currencyTrifle;
    }

    public String getCode_TFU() {
        return code_TFU;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setHeadBranch(Object headBranch) {
        this.headBranch = headBranch;
    }

    public void setBic(Object bic) {
        this.bic = bic;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public void setBranchAddresses(List<Object> branchAddresses) {
        this.branchAddresses = branchAddresses;
    }

    public void setCurrencyTrifle(Boolean currencyTrifle) {
        this.currencyTrifle = currencyTrifle;
    }

    public void setCode_TFU(String code_TFU) {
        this.code_TFU = code_TFU;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return Objects.equals(id, branch.id) &&
                Objects.equals(version, branch.version) &&
                Objects.equals(headBranch, branch.headBranch) &&
                Objects.equals(bic, branch.bic) &&
                Objects.equals(shortName, branch.shortName) &&
                Objects.equals(timeZone, branch.timeZone) &&
                Objects.equals(branchAddresses, branch.branchAddresses) &&
                Objects.equals(currencyTrifle, branch.currencyTrifle) &&
                Objects.equals(code_TFU, branch.code_TFU);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (headBranch != null ? headBranch.hashCode() : 0);
        result = 31 * result + (bic != null ? bic.hashCode() : 0);
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (timeZone != null ? timeZone.hashCode() : 0);
        result = 31 * result + (branchAddresses != null ? branchAddresses.hashCode() : 0);
        result = 31 * result + (currencyTrifle != null ? currencyTrifle.hashCode() : 0);
        result = 31 * result + (code_TFU != null ? code_TFU.hashCode() : 0);
        return result;
    }
}