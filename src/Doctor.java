public class Doctor {
    static int id = 0; // Autoincrement
    String name;
    String specialty;

    Doctor() {
        System.out.println("Building the Doctor object");
        id++;
    }

    Doctor(String name) {
        System.out.println("The assigned Doctor's name is: " + name);
        id++;
    }

    // Behaviours
    public void showName() {
        System.out.println(name);
    }

    public void showID() {
        System.out.println("Doctor ID: " + id);
    }
}
