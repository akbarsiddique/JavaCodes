public class CharacterPattern {
    public static void main(String[] args){
        char ch ='A';
        // for outer loop
        for(int line =1; line<=6; line++){
            // for inner loop
            for(int chars =1; chars<=line; chars++){
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
    }
}
