import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    // Attributes
    static int id = 0; // Autoincrement
    private String name;
    private String email;
    private String speciality;

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

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
