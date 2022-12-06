package org.wycliffe.accountingservice;

public class PartiesAccount {
    String partyAccountName = "Sendy Transport";
    String accountNumber = "str-001";
    String accountType = String.valueOf(AccountType.COMPANY_ACCOUNT);

    public PartiesAccount(String partyAccountName, String accountNumber, String accountType) {
        this.partyAccountName = partyAccountName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public String getPartyAccountName() {
        return partyAccountName;
    }

    public void setPartyAccountName(String partyAccountName) {
        this.partyAccountName = partyAccountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
