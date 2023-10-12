package practice1;

public class Branch {
    private String name;
    private String code;
    private String address;
    private Bank bank;

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        name = name1;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code1) {
        code = code1;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address1) {
        address = address1;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank1) {
        bank = bank1;
    }

    public String getBankName() {
        return bank.getName();
    }
}
