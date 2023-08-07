import java.util.Date;

public class Main {
    public static void main(String[] args) {
       /* Box<Integer> integerBox=new Box<>();
        integerBox.add(10);
        System.out.println(integerBox.toString());
        Box<String> stringBox=new Box<>();
        stringBox.add("Hello");
        System.out.println(stringBox.toString());
        */
        Numbers<Integer> numbers=new Numbers<>();
        numbers.addNumber(55);
        numbers.addNumber(7);
        numbers.addNumber(0);
        numbers.sortNumbers();
        numbers.printNumbers();


        Numbers<Double> numbersDouble=new Numbers<>();
        numbersDouble.addNumber(1000.3);
        numbersDouble.addNumber(0.3);
        numbersDouble.addNumber(71.5);
        numbersDouble.sortNumbers();
        numbersDouble.printNumbers();

        Numbers<String> numbersString=new Numbers<>();
        numbersString.addNumber("three");
        numbersString.addNumber("one");
        numbersString.addNumber("two");
        numbersString.sortNumbers();
        numbersString.printNumbers();
        numbers.printTwoParameters(1, "Hello");
        numbers.printTwoParameters(true, 0.008);
        numbers.printTwoParameters('A', false);
    }
}