public class App {
    public static void main(String[] args) {
        int age;

        age = 28;

        int monthsPerYear = 12;

        int ageInMonths = age * monthsPerYear;

        age = 12;

        System.out.println("Age in months: " + ageInMonths);

        age = 2_000_000_000 * age;
        System.out.println(age);

        System.out.println(ageInMonths);

        boolean areWeHavingFun = true;
        System.out.println(areWeHavingFun);

        age++; // age = age + 1;
    }
}
