package src.Overloading;

public class MethodOverloadingConstructor {



    public static void main(String[] args) {
        int a = 711;
        int b = 614;
        int c=456;

        double x = 71.5;
        double y = 39.2;
        double z= 45.6;

        IntegerClass integerClass = new IntegerClass(a,b,c);
        DoubleClass doubleClass = new DoubleClass(x,y,z);


        int minimumIntegerNumber = integerClass.minFunction();

        // same function name with different parameters

        double minimumDoubleNumber = doubleClass.minFunction();

        System.out.println("Minimum Value = " + minimumIntegerNumber);
        System.out.println("Minimum Value = " + minimumDoubleNumber);
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



    static class IntegerClass{
       public IntegerClass(){

        }
        int m1,m2,m3;

        public IntegerClass(int m1, int m2, int m3) {
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        }
        public  int minFunction() {
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
    }
    static class DoubleClass{
        double n1,n2,n3;
        public DoubleClass(double n1, double n2, double n3) {
            this.n1 = n1;
            this.n2 = n2;
            this.n3 = n3;
        }


        public  double minFunction() {
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
}
