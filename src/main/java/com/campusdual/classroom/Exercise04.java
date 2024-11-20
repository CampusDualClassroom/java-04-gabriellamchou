package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + sumNum(5));
        System.out.println("Suma de los primeros 20 números pares: " + sumEvenNum(20));
        System.out.println("Obtén el factorial del número 7 → (7!): " + recursiveFactorial(7));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");

    }

    public static int sumNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumEvenNum(int num) {
        int sum = 0;
        int numActual = 0;
        int pares = 0;
        while (pares <= num) {
            if (numActual % 2 == 0) {
                sum = sum + numActual;
                pares++;
            }
            numActual++;
        }
        return sum;
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int recursiveFactorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * recursiveFactorial(num - 1);
        }
    }
}
