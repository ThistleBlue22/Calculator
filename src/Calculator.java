import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void Addition(Integer[] addList) {
        System.out.println(Arrays.toString(addList));
    }
    public static void Subtraction(Integer[] subList) {
        System.out.println(Arrays.toString(subList));
    }
    public static void Multiplication(Integer[] multList) {
        System.out.println(Arrays.toString(multList));
    }
    public static void Division(Integer[] divList) {
        System.out.println(Arrays.toString(divList));
    }

    public static void Operation(Integer[] numberList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which operation would you like to perform?");
        switch (scan.next()){
            case "Addition": Addition(numberList);
            case "Subtraction": Subtraction(numberList);
            case "Multiplication": Multiplication(numberList);
            case "Division": Division(numberList);
        }
    }

    public static void main(String[] args) {

        Scanner numberScan = new Scanner(System.in);
        System.out.println("Please specify two or more numbers");

        String tempStringObject = numberScan.nextLine();
        String[] stringList = tempStringObject.split("\s");

        Integer[] intListVals = new Integer[stringList.length];

        for (int x = 0; x < stringList.length; x++){
            intListVals[x] = Integer.valueOf(stringList[x]);
        }

        Operation(intListVals);


    }


}
