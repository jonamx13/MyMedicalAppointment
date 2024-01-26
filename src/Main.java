import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Jonathan Meixueiro", "Cardiologist");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor.getAvailableAppointments());

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        /*System.out.println();
        System.out.println();
        Patient patient = new Patient("Alexandra", "alexandra@mail.com");
        Patient patient2 = new Patient("Johan", "johan@mail.com");

        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

        //Object memory behaviour
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Mandril");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());*/

    }

}
