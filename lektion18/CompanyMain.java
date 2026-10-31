void main() {
    Company company = new Company("ACME AB", "556269-1234", "Storgatan 3");

    System.out.println(company);

    Company company2 = new Company("Företag AB", "556677-1234", "Stället 23");
    System.out.println(company2);

    Company company3 = new Company("Bolaget");
    System.out.println(company3);

    Company company4 = new Company(company3.name(), "5555555-1234", "Gatan 2b");
    System.out.println(company4);
}