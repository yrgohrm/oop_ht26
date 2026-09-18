public class Employee {
    private int id;
    private String name;
    private String title;
    private String personalNumber;
    private Address address;
    private BankAccount bankAccount;

    public Employee(int id, String name, String title, String personalNumber, Address address,
            BankAccount bankAccount) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.personalNumber = personalNumber;
        this.address = address;
        this.bankAccount = bankAccount;
    }

    void pay(double amount) {
        System.out.printf("Utbetalning till %s%n", name);
        System.out.printf("För över pengar till bank %s, konto %s-%s%n",
                bankAccount.bankName,
                bankAccount.clearingNumber,
                bankAccount.accountNumber);
        System.out.printf("Skickar info till %s%n", address.street);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.length() < 2) {
            throw new IllegalArgumentException("dumt namn");
        }

        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    
}
