public class Student extends Person {
    private String program;

    public Student(String name, String program) {
        super(name);
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    @Override
    public void sayHello() {
        System.out.println("Tjabba!");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Tjabba, tjena " + name + "!");
    }

    public void sayHello(int times) {
        for (int i = 0; i < times; i++) {
            sayHello();
        }
    }
}
