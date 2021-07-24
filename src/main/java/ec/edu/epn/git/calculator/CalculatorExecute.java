package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("== Calculator Execute ==");

        Calculator c = new Calculator();
        int addition = c.addition(6,9);
        System.out.println("c.addition(6,9) = "+ addition);

        int substraction = c.substraction(9,3);
        System.out.println("c.substraction(9,3) = "+ substraction);
        System.out.println("== it is a change ==");
    }
}
