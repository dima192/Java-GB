import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int i = 0;
        int prog, user;
        do
        {
            prog = (int)(Math.random() * 10);
            System.out.print("\nprog: " + prog);  /* Для проверки работы программы */
        }
        while (prog == 0);
        System.out.println("\nВыбрано число от 1 до 10, отгадайте его.");
        System.out.print("Введите ваше число: ");
        Scanner input = new Scanner(System.in);
        if( input.hasNextInt() )
        {
            do {
                user = input.nextInt();
                if(user == prog) {
                    System.out.println("Вы угадали!");
                } else {
                    if (user >= -10 && user <= 10)
                    {
                        System.out.print("Вы не угадали! ");
                        if( prog < user )
                        {
                            System.out.println("Ваше число больше.");
                        } else {
                            System.out.println("Ваше число меньше.");
                        }
                    }
                    else
                    {
                        System.out.println("Ваше число вообще не из нужного отрезка!");
                    }
                }
                i++;
            }
            while( i < 3 );
            System.out.println("Вы не угадали количество попыток исчерпано! ");
        }
        else
        {
            System.out.println("Ошибка. Вы не ввели целое число!");
        }
    }
}