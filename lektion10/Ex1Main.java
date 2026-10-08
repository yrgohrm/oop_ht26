public class Ex1Main {
    public static void main(String[] args) {
        Student student = new Student("Jennie Jenniesson", 
                                        "Java Enterprise Utvecklare");
        
        // anropar metoden i Person
        System.out.println(student.getName());

        // anropar metoden i Student
        System.out.println(student.getProgram());

        Person person = student;
        person.getName();
        // person.getProgram();
    }
}
