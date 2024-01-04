import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Jonathan Meixueiro", "Cardiologist");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.specialty);

        Patient patient = new Patient("Alexandra", "alexandra@mail.com");
        System.out.println(patient.name);
        System.out.println(patient.email);

    }

}
