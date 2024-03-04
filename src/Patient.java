public class Patient extends User{
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email){
        super(name, email);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight + "Kg.";
    }

    public String getHeight() {
        return height + "Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
