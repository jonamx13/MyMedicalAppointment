import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Jonathan Meixueiro", "Cardiologist");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.specialty);

        Patient patient = new Patient("Alexandra", "alexandra@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

    }

}
