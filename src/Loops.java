import java.util.*;
public class Loops {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();
        int sum =i++;
        for(i=1;i<5;i++){
            System.out.println(i);
            sum = sum+1;
        }
        System.out.println(sum);
    }
}