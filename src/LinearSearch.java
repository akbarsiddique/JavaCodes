public class LinearSearch {
    public static int LinearSearch(int key,int number[]){
        for(int i =0; i< number.length;i++){
            if(number[i]==key){
                return i;

            }
        }
return -1;
    }

    public static void main(String[] args){
        int number[] = { 10,12,14,16,18,20};
        int key =20;
        int index= LinearSearch(key,number);
        System.out.println("index : "+ index);
    }
}
