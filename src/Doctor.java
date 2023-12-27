public class Doctor {
    int ID;
    String name;
    String specialty;

    Doctor() {
        System.out.println("Building the Doctor object");
    }

    Doctor(String name) {
        System.out.println("The assigned Doctor's name is: " + name);
    }

    // Behaviours
    public void showName() {
        System.out.println(name);
    }
}
