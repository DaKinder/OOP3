package gb.ClassWork.Seminar2;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args){
        char a = 'b';
        try {
            String result = Expr.expr(a);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
//    static float isFloat(String input){
//        Float num = 0.0f;
//        try{
//            num = Float.parseFloat( input );
//        }catch(NumberFormatException e ){
//            System.out.println("Your input is not a float number. Please, try again.");
//            return num.NaN;}
//
//        return num;
//    }
//    static double expr(int[] intArray, int d) {
//        Double quotient = 0.0;
//        try {
//            quotient = (double)intArray[8];
//            try {
//                quotient /= d;
//                if(d == 0) throw new ArithmeticException();
//            }catch (Exception e){
//                System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
//                return quotient.NaN;
//            }
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println( "It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array." );
//            return quotient.NaN;
//        }
//        System.out.println("intArray[8] / d = 8 / " + d + " = " + quotient);
//        return quotient;
//    }

//class Expr {
//
//    public static double expr(int a, int b) {
//
//        if(b != 0) {
//            printSum(a, b);
//            return (double) a / b;}
//
//        else{
//            System.out.println("Делить на ноль нельзя");
//            printSum(a, b);
//            return (double)b;
//        }
//    }
//
//    public static void printSum(int a, int b) {
//
//        System.out.println(a + b);
//    }
//}
class Expr {
    public static String expr(char a) throws Exception {

        if(a != ' ') return "Your input was - " + a;
        Exception e = new Exception("Empty string has been input.");
        throw new RuntimeException(e.getMessage());
    }
}

