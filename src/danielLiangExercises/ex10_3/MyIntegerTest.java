package danielLiangExercises.ex10_3;

public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger myInt1 = new MyInteger(7);
        MyInteger myInt2 = new MyInteger(10);

        System.out.println("Value: " + myInt1.getValue());
        System.out.println("Is Even? " + myInt1.isEven());
        System.out.println("Is Odd? " + myInt1.isOdd());
        System.out.println("Is Prime? " + myInt1.isPrime());

        System.out.println("\nStatic Methods:");
        System.out.println("Is 10 Even? " + MyInteger.isEven(10));
        System.out.println("Is 7 Odd? " + MyInteger.isOdd(7));
        System.out.println("Is 13 Prime? " + MyInteger.isPrime(13));

        System.out.println("\nUsing MyInteger object:");
        System.out.println("Is myInt2 Even? " + MyInteger.isEven(myInt2));
        System.out.println("Is myInt1 Odd? " + MyInteger.isOdd(myInt1));

        System.out.println("\nEquals Methods:");
        System.out.println("Does myInt1 equal 7? " + myInt1.equals(7));
        System.out.println("Does myInt2 equal myInt1? " + myInt2.equals(myInt1));

        System.out.println("\nParsing Methods:");
        char[] charArray = {'1', '2', '3'};
        System.out.println("Parsed char array to int: " + MyInteger.parseInt(charArray));
        System.out.println("Parsed String \"456\" to int: " + MyInteger.parseInt("456"));
    }
}

