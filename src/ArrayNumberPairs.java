public class ArrayNumberPairs {
    public static void pairsNumber(int number[]){
for(int i =0; i<number.length;i++){
    int cuur=number[i];
    for (int j =i+1;j<number.length;j++){
        System.out.print("("+cuur+","+number[j]+")");

    }
    System.out.println();
}
    }
    public static void main(String[] args){
        int number[] = {2,4,6,8,10};
 pairsNumber(number);
    }
}
