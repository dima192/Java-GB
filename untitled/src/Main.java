import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("CatsCategory");
        Cat cat = new Cat("Barsik", 200, false, 2);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Scanner in = new Scanner(System.in);
        System.out.print("Input a cat run : ");
        int run = in.nextInt();

        if(run<200){
        System.out.printf("Cat ran %d \n",run);
        System.out.print("Input a cat jump : ");
        }
        else{
            System.out.print("False!");
        }
        int jump= in.nextInt();
        if (jump<2){
            System.out.printf("Cat jump %d \n",run);
            }
        else{
            System.out.print("False!");
        }

    }
}
