public class Doctor {
    // Attributes
    static int id = 0; // Autoincrement
    String name;
    String email;
    String speciality;

    Doctor() {
        System.out.println("Building the Doctor object");
        id++;
    }

    //Behaviours
    Doctor(String name, String specialty) {
        System.out.println("The assigned Doctor's name is: " + name);
        id++;
        this.name = name;
        this.speciality = specialty;
    }

    // Behaviours
    public void showName() {
        System.out.println(name);
    }

    public void showID() {
        System.out.println("Doctor ID: " + id);
    }
}
