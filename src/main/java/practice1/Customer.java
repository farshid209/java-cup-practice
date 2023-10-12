package practice1;

public class Customer {
    private String name;
    private String mobileNumber;
    private Account account;
    private String nationalId;

    public String getName() {
        return name;
    }

    public void setName(String name2) {
        name = name2;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber1) {
        mobileNumber = mobileNumber1;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account1) {
        account = account1;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId1) {
        nationalId = nationalId1;
    }

    public void activeCustomer(boolean deactivate) {
        account.setBlocked(deactivate);
    }
}
