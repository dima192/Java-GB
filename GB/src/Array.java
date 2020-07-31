public class Array {

    public static void main(String[] args) {

        Worker[] persArray = new Worker[5]; // Вначале объявляем массив объектов
        persArray[0] = new Worker("Dima", "GAZ", "GAZ@mail.ru", "master", 35, 03123456, 1000, 35); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Worker("Dima1", "GAZ1", "GAZ1@mail.ru", "master", 45, 03123456, 1500, 45);
        persArray[2] = new Worker("Dima2", "GAZ2", "GAZ2@mail.ru", "master", 25, 03123456, 2000, 25);
        persArray[3] = new Worker("Dima3", "GAZ3", "GAZ3@mail.ru", "master", 55, 03123456, 1100, 55);
        persArray[4] = new Worker("Dima4", "GAZ4", "GAZ4@mail.ru", "master", 65, 03123456, 1300, 65);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) persArray[i].printInfo();
        }
    }
}