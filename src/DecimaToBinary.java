

public class DecimaToBinary {
    public static void binToDec(int binNum){
        int pow =0;
        int mynum= binNum;
        int decNum= 0;
        while (binNum>0){
            int lastdigit = binNum%10;
            decNum = decNum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binNum =binNum/10;

        }
        System.out.println("decimal of " + mynum+" =  "+decNum);
    }

    public static void main(String [] args){
        binToDec(100);
    }
}
