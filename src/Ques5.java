 import java.util.*;

public class Ques5 {
public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter radius: ");
    int radius  = sc.nextInt();
    double pi = 3.14;
    double area = pi*radius*radius;
    double perimeter = 2*pi*radius;
    System.out.println("The area of circle is :"+area);
    System.out.println("The perimeter of circle is :"+ perimeter);

}
}
