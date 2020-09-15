
public class Ex1_1_19 {
    public static long[] fib(int num) {
        long[] list_fib = new long[num + 1];
        if (num == 0)
            return list_fib;
        if (num == 1)
            return list_fib;
        // return fib(num - 1) + fib(num - 2);
        for (int i = 2; i <= num; i++) {
            list_fib[i] = list_fib[i - 1] + list_fib[i - 2];
        }
        return list_fib;
    }

    public static int count(int sum) {
        int t = 0;

        t = sum;
        return t;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + "  " + fib(i));
        }
    }
}