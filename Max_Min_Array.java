import java.util.Scanner;
import java.util.Arrays;

public class Max_Min_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int entry = scan.nextInt();
        int[] list = {0, 33, 56, -33, -67, 22, 105, 222};
        int min = list[0];
        int max = list[0];
        int nearMax = list[0];
        int nearMin = list[0];
        Arrays.sort(list);
        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
            if (entry < i) {
                nearMax = i;
                break;
            }
            if (entry > i) {
                nearMin = i;
            } else {
                break;
            }
        }
        System.out.println("Minimum değer: " + min);
        System.out.println("Maximum değer: " + max);
        System.out.println("En yakın büyük sayı: " + nearMax);
        System.out.println("En yakın küçük sayı: " + nearMin);
    }
}

