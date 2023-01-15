public class AddTwoBinaryNumber {

        public static void main(String[] args) {


            String binaryNumber1 = "10101", binaryNumber2 = "10001";
            Integer integer1 = Integer.parseInt(binaryNumber1, 2);
            Integer integer2 = Integer.parseInt(binaryNumber2,2);


            Integer output = integer1 + integer2;


            System.out.println(Integer.toBinaryString(output));

        }

    }

