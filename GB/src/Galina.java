import javax.xml.namespace.QName;

public class Galina {
    public static void main(String[] args) {
            Worker worker = new Worker();
            System.out.println("Profile");
            worker.setName("GA");
            worker.setSurname("GAZ");
            worker.setEmail("GAZ");
            worker.setPosition("GAZ");
            worker.setYear(10);
            worker.setPhone(03123456);
            worker.setWages(100);
            worker.setAge(24);
            System.out.println(worker.toString());

    }
}
