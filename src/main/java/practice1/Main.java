package practice1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setPage(200);
        book.setName("Chaldoran");
        book.setAuthor("Farshid Hosseinpour");
        book.setType("history");

        System.out.println(book.getName());
        book.setName("Isfahan");
        System.out.println(book.getName());

        Member member = new Member();
        member.setId(234556L);
        member.setName("ali");
        member.setNationalId("00123432");
        System.out.println(member.getId());
        System.out.println(member.getNationalId());
        System.out.println(member.getName());


        Account account = new Account();
        account.setName("ehsanRostaei");
        account.setNumber("09301231231");
        account.setBlocked(true);
        System.out.println(account.getName());
        System.out.println(account.getNumber());

        Bank bank = new Bank();
        bank.setName("mellat");
        System.out.println(bank.getName());

        Branch branch = new Branch();
        branch.setAddress("tehran");
        branch.setCode("0034");
        branch.setBank(bank);
        System.out.println(branch.getAddress());
        System.out.println(branch.getCode());

        Customer customer = new Customer();
        customer.setName("Soghra Asghari");
        customer.setMobileNumber("09121234567");
        customer.setAccount(account);
        System.out.println(customer.getName());
        System.out.println(customer.getMobileNumber());

        CreditCard creditCard = new CreditCard();
        creditCard.setCustomer(customer);
        creditCard.setBank(bank);
        creditCard.setAccount(account);
        creditCard.setNumber("6219861954670987");
        creditCard.setCvv2("009");
        creditCard.setExpireDate(new Date());
        creditCard.setFirstPassword("4321");
        creditCard.setSecondPassword("98760");
        System.out.println(creditCard.getNumber());
        System.out.println(creditCard.getCvv2());
    }
}
