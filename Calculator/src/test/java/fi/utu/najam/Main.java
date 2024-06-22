package fi.utu.najam;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calculator calculator = new Calculator();
        System.out.println(calculator.getResult());
        calculator.add(9);
        System.out.println(calculator.getResult());
        calculator.multiply(5);
        System.out.println(calculator.getResult());
        calculator.subtract(50);
        System.out.println(calculator.getResult());
        calculator.exponent(2);
        System.out.println(calculator.getResult());

//        CalculatorTest tester = new CalculatorTest();
//        tester.add();
    }
}

class Calculator {
    private int result;

    public Calculator() {
        reset();
    }

    public void reset() {
        this.result = 0;
    }

    public int getResult() {
        return this.result;
    }

    public void add(int value) {
        this.result += value;
    }

    public void subtract(int value) {
        this.result -= value;
    }

    public void multiply(int value) {
        this.result *= value;
    }

    public void exponent(int value) {
        for(int i=1; i<value; i++) {
            this.result *= this.result;
        }
    }
}

class CalculatorTest {

    @Test
    void getResult() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.getResult());
    }

    @Test
    void add() {
        Calculator calculator = new Calculator();
        calculator.add(10);
        calculator.add(-5);
        assertEquals(5, calculator.getResult());
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.multiply(2);
        calculator.multiply(-3);
        assertEquals(-30, calculator.getResult());
    }

    @Test
     void subtract() {
        Calculator calculator = new Calculator();
        calculator.add(10);
        calculator.subtract(5);
        assertEquals(5, calculator.getResult());
    }
}
