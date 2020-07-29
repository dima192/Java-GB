public class Worker {
    private String name;
    private String surname;
    private String email;
    private String position;
    private int year;
    private int phone;
    private int wages;
    private int age;

    public Worker() {
        System.out.println(" profile ");
    }

    public Worker(String name, String surname,String email,String position, int year,int phone, int wages, int age) {
        System.out.println("Predefined-auto construction...");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void start() {
        System.out.println(String.format("Auto[%s][%s] is starting", name, this.surname));
        startEngine();
    }

    private void startEngine() {
        System.out.println(String.format("Engine[%s] is starting...", year));
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", year=" + year +
                ", phone=" + phone +
                ", wages=" + wages +
                ", age=" + age +
                '}';
    }
}