public class MethodOverloding {
    static int plusMethod(int x, int y){
        return x+y;
    }
    static double plusMethod(double x , double y){
        return x+y;
    }

    public static void main(String[] args) {
        int muNum1 = plusMethod(5,4);
        double myNum2 = plusMethod(4.09,4.45);
        System.out.println("int : " + muNum1 + ";" + "double: " + myNum2);
    }
}
