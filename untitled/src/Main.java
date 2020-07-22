import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arrll = arr.length;
        for (int i = 0; i < arrll; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println("Task_1:");
        System.out.println(Arrays.toString(arr));



        int[] array = new int[8];
        int j = 0;
        int fill = array.length;
        System.out.println("Task_2");
        for (int i = 0; i < fill; ++i, j = j + 3) {
            array[i] = j;
            System.out.print(+array[i] + " ");
            System.out.println(" ");
        }


        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arr3 = array3.length;
        for (int i = 0; i < arr3; i++) {
            if (array3[i] < 6)
                array3[i] = array3[i] * 2;
        }
        System.out.print("Task_3:  ");
        for (int i = 0; i < arr3; i++)
            System.out.print(+array3[i] + ", ");



        int[][] sqArr = new int[2][2];
        System.out.println(" ");
        System.out.println("Task_4");
        for (int i = 0; i < 2; i++) {
            for (int l = 0; l < 2; l++) {
                if (i < l) {
                    sqArr[i][l] = 0;
                } else if (i > l) {
                    sqArr[i][l] = 1;
                } else {
                    sqArr[i][l] = 1;
                }
                System.out.print(sqArr[i][l] + " ");
            }
            System.out.println();
        }


    }
}