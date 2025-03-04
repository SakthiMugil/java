import java.util.Scanner;

public class Assesmentprogram3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String b = a.nextLine();

        if (UsingString(b)) {
            System.out.println("Palindrome (Using String )");
        } else {
            System.out.println("Not a Palindrome (Using String )");
        }

        if (UsingStringBuilder(b)) {
            System.out.println("Palindrome (Using StringBuilder)");
        } else {
            System.out.println("Not a Palindrome (Using StringBuilder )");
        }

        if (UsingStringBuffer(b)) {
            System.out.println("Palindrome (Using StringBuffer )");
        } else {
            System.out.println("Not a Palindrome (Using StringBuffer )");
        }

        if (WithoutBuiltIn(b)) {
            System.out.println("Palindrome (Without built-in)");
        } else {
            System.out.println("Not a Palindrome (Without built-in )");
        }
        a.close();
    }

    static boolean UsingString(String str) {
        String rev= new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

    static boolean UsingStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str.equals(sb.toString());
    }

     static boolean UsingStringBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        return str.equals(sb.toString());
    }

    static boolean WithoutBuiltIn(String str) {
        int i= 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}