import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayExample {
    public static void main(String[] args) {
       int age [] = {6,5,3,7,8,1,2};

//    int newAge [] = Arrays.copyOfRange(age,2,6);   //range me crop karega

        IntStream newAge = Arrays.stream(age);

        System.out.println(newAge);
    }
}

