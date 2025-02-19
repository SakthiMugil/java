import java.util.*;

public class reversearraywithouttemp {
    public static void main(String[] args){
        Integer [] arr = {10, 20, 30, 40, 50};
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    }
}
