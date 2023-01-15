
/*
 public class TypeCasting {
    public static void main(String[] args){
        float a = 22.3f;
        int b = (int) a;
        System.out.println(b);
    }
}
*/
import java.util.*;
public class TypeCasting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average= (a+b+c) /3;
        System.out.println(" average is equal to : " + average);
    }
}