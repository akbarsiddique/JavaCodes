
//public class BreakStatment {
  //  public static void main(String[] args){
    //   for(int i =1; i<=5; i++){
       //     if(i==3){
         //       break;

           // }
           //System.out.println(i);
        //}
        //System.out.println("i m out of Loop");
    //}
//}
// Keep entering number till user entera multiple
import java.util.*;

public class BreakStatment {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        do {
            System.out.println("Enter your number");
            int i = sc.nextInt();
            if (i % 10 == 0) {
                break;
            }
            System.out.println(i);
        }while(true);

    }
}