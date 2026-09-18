public class ExpensiveApp {
    public static void main(String[] args) {
        Address addr = new Address("Forskningsgången 4",
                "420 69",
                "Göteborg",
                "SWEDEN");

        BankAccount bankAccount = new BankAccount("Handelsbanken",
                "5678",
                "123456");

        Employee bosse = new Employee(2, "Bosse Bredsladd",
                "Utvecklare",
                "640312-1234",
                addr,
                bankAccount);

        bosse.pay(35000);

    }
}
