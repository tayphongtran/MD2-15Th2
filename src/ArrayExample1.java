import java.util.Random;
import java.util.Scanner;

public class ArrayExample1 {
    public Integer[] creatRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("so phan tu");
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample1 arr1 = new ArrayExample1();
        Integer[] arr = arr1.creatRandom();
//        System.out.println(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap chi so bat ki");
        int x = scanner.nextInt();
        try {
            System.out.println(" gia tri item co index " + x + " la " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println(" chi so vuot qua gioi han");
        }

    }
}
