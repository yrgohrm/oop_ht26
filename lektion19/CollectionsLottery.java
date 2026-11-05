import java.util.*;

void main() {
    Collection<String> names = new ArrayList<>();

    try (Scanner input = new Scanner(System.in)) {

        // read all names
        String name;
        while (true) {
            name = input.nextLine();
            if (name.isBlank()) {
                break;
            }

            boolean added = names.add(name);
            if (!added) {
                System.out.println("Du är redan med i lotteriet!");
            }
        }

        // find a winner
        // List<String> listOfNames = new ArrayList<>(names);
        // int winnerNumber = RandomGenerator.getDefault().nextInt(listOfNames.size());
        // String winner = listOfNames.get(winnerNumber);
        Iterator<String> it = names.iterator();
        int winnerNumber = RandomGenerator.getDefault().nextInt(names.size());
        String winner = null;
        for (int i = 0; i <= winnerNumber && it.hasNext(); ++i) {
            winner = it.next();
        }

        System.out.println("Vinnaren är: " + winner);
    }
}