import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public enum Day {
        MONDAY("Lunes"),
        TUESDAY("Martes"),
        WEDNESDAY("Miercoles");

        private String spanish;
        private Day(String s) {
            spanish = s;
        }

        private String getSpanish() {
            return spanish;
        }

    }
    public static void main(String[] args) {
        // showMenu();

        System.out.println(Day.MONDAY);
        System.out.println(Day.MONDAY.getSpanish());

        Doctor myDoctor = new Doctor("Jonathan Meixueiro", "jona@mx13.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        // This returns the objects lists created after "myDoctor.addAvailableAppointment"
        // System.out.println(myDoctor.getAvailableAppointments());
        System.out.println(myDoctor);

        /*
        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alexandra", "alexandra@mail.com");

        System.out.println(patient);

    }

}
