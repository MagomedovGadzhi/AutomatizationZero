package Lesson12.task3.document;

import java.util.List;
import java.util.Objects;

public class Document {
    private Integer id;
    private Integer edocRefId;
    private String globalId;
    private Integer typeId;
    private String channel;
    private Integer documentNumber;
    private String documentDate;
    private String version;
    private Object read;
    private Client client;
    private Status status;
    private List<Object> checkResults;
    private Object sellingPoint;
    private IdentityDocument identityDocument;
    private Object clientExternalIds;
    private BankAccount bankAccount;
    private OperBranch operBranch;
    private String operationDate;
    private String description;
    private Currency currency;
    private Double amount;
    private List<SymbolAmount> symbolAmounts;
    private List<CashQuantity> cashQuantities;
    private Object commissionAccount;
    private Object budget;
    private List<Object> budgetAmounts;
    private Object classifier;
    private Object noteFromBank;
    private Object cancelRequest;
    private Boolean cancelReqInProgress;

    public Document(Integer id, Integer edocRefId, String globalId, Integer typeId, String channel, Integer documentNumber, String documentDate, String version, Object read, Client client, Status status, List<Object> checkResults, Object sellingPoint, IdentityDocument identityDocument, Object clientExternalIds, BankAccount bankAccount, OperBranch operBranch, String operationDate, String description, Currency currency, Double amount, List<SymbolAmount> symbolAmounts, List<CashQuantity> cashQuantities, Object commissionAccount, Object budget, List<Object> budgetAmounts, Object classifier, Object noteFromBank, Object cancelRequest, Boolean cancelReqInProgress) {
        this.id = id;
        this.edocRefId = edocRefId;
        this.globalId = globalId;
        this.typeId = typeId;
        this.channel = channel;
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
        this.version = version;
        this.read = read;
        this.client = client;
        this.status = status;
        this.checkResults = checkResults;
        this.sellingPoint = sellingPoint;
        this.identityDocument = identityDocument;
        this.clientExternalIds = clientExternalIds;
        this.bankAccount = bankAccount;
        this.operBranch = operBranch;
        this.operationDate = operationDate;
        this.description = description;
        this.currency = currency;
        this.amount = amount;
        this.symbolAmounts = symbolAmounts;
        this.cashQuantities = cashQuantities;
        this.commissionAccount = commissionAccount;
        this.budget = budget;
        this.budgetAmounts = budgetAmounts;
        this.classifier = classifier;
        this.noteFromBank = noteFromBank;
        this.cancelRequest = cancelRequest;
        this.cancelReqInProgress = cancelReqInProgress;
    }

    public Document() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEdocRefId() {
        return edocRefId;
    }

    public void setEdocRefId(Integer edocRefId) {
        this.edocRefId = edocRefId;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(Integer documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Object getRead() {
        return read;
    }

    public void setRead(Object read) {
        this.read = read;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Object> getCheckResults() {
        return checkResults;
    }

    public void setCheckResults(List<Object> checkResults) {
        this.checkResults = checkResults;
    }

    public Object getSellingPoint() {
        return sellingPoint;
    }

    public void setSellingPoint(Object sellingPoint) {
        this.sellingPoint = sellingPoint;
    }

    public IdentityDocument getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(IdentityDocument identityDocument) {
        this.identityDocument = identityDocument;
    }

    public Object getClientExternalIds() {
        return clientExternalIds;
    }

    public void setClientExternalIds(Object clientExternalIds) {
        this.clientExternalIds = clientExternalIds;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public OperBranch getOperBranch() {
        return operBranch;
    }

    public void setOperBranch(OperBranch operBranch) {
        this.operBranch = operBranch;
    }

    public String getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<SymbolAmount> getSymbolAmounts() {
        return symbolAmounts;
    }

    public void setSymbolAmounts(List<SymbolAmount> SymbolAmountAmounts) {
        this.symbolAmounts = SymbolAmountAmounts;
    }

    public List<CashQuantity> getCashQuantities() {
        return cashQuantities;
    }

    public void setCashQuantities(List<CashQuantity> cashQuantities) {
        this.cashQuantities = cashQuantities;
    }

    public Object getCommissionAccount() {
        return commissionAccount;
    }

    public void setCommissionAccount(Object commissionAccount) {
        this.commissionAccount = commissionAccount;
    }

    public Object getBudget() {
        return budget;
    }

    public void setBudget(Object budget) {
        this.budget = budget;
    }

    public List<Object> getBudgetAmounts() {
        return budgetAmounts;
    }

    public void setBudgetAmounts(List<Object> budgetAmounts) {
        this.budgetAmounts = budgetAmounts;
    }

    public Object getClassifier() {
        return classifier;
    }

    public void setClassifier(Object classifier) {
        this.classifier = classifier;
    }

    public Object getNoteFromBank() {
        return noteFromBank;
    }

    public void setNoteFromBank(Object noteFromBank) {
        this.noteFromBank = noteFromBank;
    }

    public Object getCancelRequest() {
        return cancelRequest;
    }

    public void setCancelRequest(Object cancelRequest) {
        this.cancelRequest = cancelRequest;
    }

    public Boolean getCancelReqInProgress() {
        return cancelReqInProgress;
    }

    public void setCancelReqInProgress(Boolean cancelReqInProgress) {
        this.cancelReqInProgress = cancelReqInProgress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(id, document.id) &&
                Objects.equals(edocRefId, document.edocRefId) &&
                Objects.equals(globalId, document.globalId) &&
                Objects.equals(typeId, document.typeId) &&
                Objects.equals(channel, document.channel) &&
                Objects.equals(documentNumber, document.documentNumber) &&
                Objects.equals(documentDate, document.documentDate) &&
                Objects.equals(version, document.version) &&
                Objects.equals(read, document.read) &&
                Objects.equals(client, document.client) &&
                Objects.equals(status, document.status) &&
                Objects.equals(checkResults, document.checkResults) &&
                Objects.equals(sellingPoint, document.sellingPoint) &&
                Objects.equals(identityDocument, document.identityDocument) &&
                Objects.equals(clientExternalIds, document.clientExternalIds) &&
                Objects.equals(bankAccount, document.bankAccount) &&
                Objects.equals(operBranch, document.operBranch) &&
                Objects.equals(operationDate, document.operationDate) &&
                Objects.equals(description, document.description) &&
                Objects.equals(currency, document.currency) &&
                Objects.equals(amount, document.amount) &&
                Objects.equals(symbolAmounts, document.symbolAmounts) &&
                Objects.equals(cashQuantities, document.cashQuantities) &&
                Objects.equals(commissionAccount, document.commissionAccount) &&
                Objects.equals(budget, document.budget) &&
                Objects.equals(budgetAmounts, document.budgetAmounts) &&
                Objects.equals(classifier, document.classifier) &&
                Objects.equals(noteFromBank, document.noteFromBank) &&
                Objects.equals(cancelRequest, document.cancelRequest) &&
                Objects.equals(cancelReqInProgress, document.cancelReqInProgress);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (edocRefId != null ? edocRefId.hashCode() : 0);
        result = 31 * result + (globalId != null ? globalId.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        result = 31 * result + (channel != null ? channel.hashCode() : 0);
        result = 31 * result + (documentNumber != null ? documentNumber.hashCode() : 0);
        result = 31 * result + (documentDate != null ? documentDate.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (read != null ? read.hashCode() : 0);
        result = 31 * result + (client != null ? client.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (checkResults != null ? checkResults.hashCode() : 0);
        result = 31 * result + (sellingPoint != null ? sellingPoint.hashCode() : 0);
        result = 31 * result + (identityDocument != null ? identityDocument.hashCode() : 0);
        result = 31 * result + (clientExternalIds != null ? clientExternalIds.hashCode() : 0);
        result = 31 * result + (bankAccount != null ? bankAccount.hashCode() : 0);
        result = 31 * result + (operBranch != null ? operBranch.hashCode() : 0);
        result = 31 * result + (operationDate != null ? operationDate.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (symbolAmounts != null ? symbolAmounts.hashCode() : 0);
        result = 31 * result + (cashQuantities != null ? cashQuantities.hashCode() : 0);
        result = 31 * result + (commissionAccount != null ? commissionAccount.hashCode() : 0);
        result = 31 * result + (budget != null ? budget.hashCode() : 0);
        result = 31 * result + (budgetAmounts != null ? budgetAmounts.hashCode() : 0);
        result = 31 * result + (classifier != null ? classifier.hashCode() : 0);
        result = 31 * result + (noteFromBank != null ? noteFromBank.hashCode() : 0);
        result = 31 * result + (cancelRequest != null ? cancelRequest.hashCode() : 0);
        result = 31 * result + (cancelReqInProgress != null ? cancelReqInProgress.hashCode() : 0);
        return result;
    }
}