public class Main {
    public static void main(String[] args) {
            int a = 5;
            int result = a-- - --a + ++a + a++ + a;
            System.out.println(result);

            int b = 8;
            int result2 = ++b - b++ + ++b - --b;
            System.out.println(result2);

            int i1 = 5;
            int i2 = 11;
            double d1 = 5.5;
            double d2 = 1.3;
            long L = 20L;
            double result3 = 0;
            result3 = i2 / d1 + d2 % i1 - L;
            System.out.println(result3);

            int x1 = 5;
            int y1 = 1;
            double d3 = 8.3d;
            int result4 = (int) (x1 * (8.3 - y1) / x1 - y1) * (x1 + y1);
            System.out.println(result4);
            ;

            double x2 = 1.1;
            double y2 = 0.5;
            double result5;
            double d4 = 8.3d;
            result5 = (double) (x2 * (8.3 - y2) / x2 - y2) * (x2 + y2);
            System.out.println(result5);
    }
}
