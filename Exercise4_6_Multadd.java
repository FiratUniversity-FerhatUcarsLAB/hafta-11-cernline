public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        return x * Math.exp(-x) + (1 - Math.exp(-x));
    }

    public static void main(String[] args) {

        System.out.println(multadd(1.0, 2.0, 3.0));

        double trig = Math.sin(Math.PI / 4) + Math.cos(Math.PI / 4) / 2;
        System.out.println(trig);

        double logs = Math.log(10) + Math.log(20);
        System.out.println(logs);

        System.out.println(expSum(2));
    }
}
