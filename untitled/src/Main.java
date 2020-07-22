import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
/*
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arrll = arr.length;
        for (int i = 0; i < arrll; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println("Task 1:");
            System.out.println(Arrays.toString(arr));
*/
        
     int[] array = new int[8];
        int j = 0;
        int fill = array.length;
        System.out.println("Task 2:");
        for (int i = 0; i < fill; ++i, j = j + 3) {
            array[i] = j;
            System.out.print(+array[i] + " ");
        }
    }


}