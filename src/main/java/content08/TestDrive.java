package content08;

public class TestDrive {

    public static void main(String[] args) {

        double money = 1.03;
        double ticket = 0.42;
        System.out.println("Money Left: " + (money-ticket));

        double a1 = 0.1;
        double a2 = 0.2;
        System.out.println(a1+a2);
//
//
//        MathContext precision = new MathContext(3); // example 2
//        BigDecimal res;
//        BigDecimal a = new BigDecimal("4");
//        BigDecimal b = new BigDecimal("3");
//        res = a.divide(b,precision);
//        System.out.println(res);

        int c = 4;
        int d = 3;
        System.out.println(4/3); // 1,33
        System.out.println(8/3); // 2,66
    }

}
