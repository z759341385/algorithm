

public class Ex_1_1_20 {

    public static double cal(int num) {
        int  sum = 1;
        for (int i = 1; i <= num; i++) {
            sum = i * sum;
        }
        System.out.println(sum);
        return Math.log1p(sum);
    }

    public static void main(final String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i+" value is" + cal(i));
        }
    }
}