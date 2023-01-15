import java.util.*;

public class OnlyPractice {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num[] = new int[20];
        String name[]=new String[5];
        name[0]="Akbar";
        num[0]= sc.nextInt();
        num[1]= sc.nextInt();
        num[2]= sc.nextInt();
        num[3]= sc.nextInt();
        System.out.println("py:"+ num[0]);
        System.out.println("Name:"+name[0]);
        System.out.println("math:"+ num[1]);
        System.out.println("eng:"+ num[2]);
        System.out.println("Science:"+ num[3]);
        num[1]=num[1]+1;
        System.out.println("math:"+num[1]);

    }
}