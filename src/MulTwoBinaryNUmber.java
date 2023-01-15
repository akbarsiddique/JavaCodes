import java.util.Scanner;
public class MulTwoBinaryNUmber {
        static long binaryProduct(long binNum1, long binNum2) {
            int i = 0;
            long rem = 0;
            long product = 0;
            long sum[] = new long[20];

            while (binNum1 != 0 || binNum2 != 0) {
                sum[i] = (binNum1 % 10 + binNum2 % 10 + rem) % 2;
                rem = (binNum1 % 10 + binNum2 % 10 + rem) / 2;

                binNum1 = binNum1 / 10;
                binNum2 = binNum2 / 10;
                i = i + 1;
            }

            if (rem != 0)
                sum[i] = rem;

            while (i >= 0) {
                product = product * 10 + sum[i];
                i = i - 1;
            }

            return product;
        }

        public static void main(String[] args) {
            Scanner SC = new Scanner(System.in);

            long binNum1 = 0;
            long binNum2 = 0;
            long product = 0;

            long digit = 0;
            long factor = 1;

            System.out.printf("Enter Number1: ");
            binNum1 = SC.nextLong();

            System.out.printf("Enter Number2: ");
            binNum2 = SC.nextLong();

            while (binNum2 != 0) {
                digit = (long)(binNum2 % 10L);

                if (digit == 1) {
                    binNum1 = binNum1 * factor;
                    product = binaryProduct(binNum1, product);
                } else {
                    binNum1 = binNum1 * factor;
                }

                binNum2 = binNum2 / 10;
                factor = 10;
            }
            System.out.println("Product of numbers: " + product);
        }
    }

