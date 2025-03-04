import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String b = a.nextLine();
        String[] arr = b.trim().split("\\s+");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] +" ");
        }
    }
}       

