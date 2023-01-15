import java.util.*;
public class Rectangle {

    public static void main(String[] args){;
        Scanner sc =new Scanner(System.in);
       int l=  sc.nextInt();
        int b=  sc.nextInt();
        int area = l*b;
        int perimeter = 2*(l*b);
        System.out.println("Area of rectangle" + area);
        System.out.println("perimeter of rectangle" + perimeter);
    }
}
