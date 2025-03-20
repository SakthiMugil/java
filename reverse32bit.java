import java.util.Scanner;

class reverse32bit{
    public static void main(String[] args) {
        bit();
    }

    static void bit() {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter: ");
        int a = x.nextInt();
        String binaryString = String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.print(binaryString);  
    }
} 