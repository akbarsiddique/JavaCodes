public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {100, 30, 50, 60, 40, 20, 10, 220};
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1-i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "  ");
        }
    }
}