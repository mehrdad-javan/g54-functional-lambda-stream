package se.lexicon;

public class LambdaDemo {

    static DoStringStuff concatenate = (param1, param2) -> param1 + " " + param2;
    static DoStringStuff getBiggestString = (s1, s2) -> s1.length() >= s2.length() ? s1 : s2;

    static DoubleOperator addition = (num1, num2) -> num1 + num2;
    static DoubleOperator subtraction = (num1, num2) -> num1 - num2;
    static DoubleOperator multiplication = (num1, num2) -> num1 * num2;


    public static String duStringStuff(String s1, String s2, DoStringStuff logic) {
        return logic.operate(s1, s2);
    }

    public static Double calcOperator(Double n1, Double n2, DoubleOperator operator) {
        return operator.apply(n1, n2);
    }



    public static void main(String[] args) {

        System.out.println(duStringStuff("Mehrdad", "Javan", concatenate));
        System.out.println(calcOperator(10d, 20d, addition));
        System.out.println(calcOperator(10d, 20d, subtraction));
        System.out.println(calcOperator(10d, 20d, multiplication));

    }

}
