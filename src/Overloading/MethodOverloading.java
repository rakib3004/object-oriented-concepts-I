package src.Overloading;

public class MethodOverloading {

    public static void main(String[] args) {
        int a = 711;
        int b = 614;
        int c=456;
        double x = 71.5;
        double y = 39.2;
        double z= 45.6;

        int result1 = minFunction(a, b, c);

        // same function name with different parameters

        double result2 = minFunction(x, y, z);

        System.out.println("Minimum Value = " + result1);
        System.out.println("Minimum Value = " + result2);
    }

    // for integer

    public static int minFunction(int m1, int m2, int m3) {
        int min;

        if (m1 > m2) {
            min = m2;
        } else {
            min = m1;
        }
        if(min > m3){
            min=m3;
        }
        return min;
    }
    // for double

    public static double minFunction(double n1, double n2, double n3) {
        double min;

        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        if(min > n3){
            min=n3;
        }
        return min;
    }
}