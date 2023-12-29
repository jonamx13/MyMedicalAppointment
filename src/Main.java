import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Geralt de Rivia";
        myDoctor.showName();
        myDoctor.showID();

        Doctor myDoctorJhon = new Doctor();
        myDoctor.showID();

        showMenu();
    }

}
