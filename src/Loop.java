import java.util.*;

public class Loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int i =0;
        while(i<=n){
            sum+=i;
            i++;


        }
        System.out.println(sum);
    }
}
