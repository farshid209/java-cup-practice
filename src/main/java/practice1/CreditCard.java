package practice1;

import java.util.Date;

public class CreditCard {
    private Customer customer;
    private Bank bank;
    private Account account;
    private String number;
    private String cvv2;
    private Date expireDate;
    private String firstPassword;
    private String secondPassword;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer1) {
        customer = customer1;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank2) {
        bank = bank2;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account3) {
        account = account3;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number4) {
        number = number4;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2a) {
        cvv2 = cvv2a;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate1) {
        expireDate = expireDate1;
    }

    public String getFirstPassword() {
        return firstPassword;
    }

    public void setFirstPassword(String firstPassword1) {
        firstPassword = firstPassword1;
    }

    public String getSecondPassword() {
        return secondPassword;
    }

    public void setSecondPassword(String secondPassword1) {
        secondPassword = secondPassword1;
    }
}
