package adaitw.java;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Consola {
    private static final Scanner scanner;

    private Consola() {
    }

    public static int validateInt(String prompt) {
        System.out.print(prompt);

        while(!scanner.hasNextInt()) {
            System.out.print(prompt);
            scanner.next();
        }

        int input = scanner.nextInt();
        return input;
    }

    public static int validateInt(String prompt, int min, int max) {
        int input;
        do {
            System.out.print(prompt);

            while(!scanner.hasNextInt()) {
                System.out.print(prompt);
                scanner.next();
            }

            input = scanner.nextInt();
        } while(input < min || input > max);

        return input;
    }

    public static String validarNewCall(String prompt) {
        System.out.print(prompt);

        String result;
        for(result = scanner.next(); !result.equals("true") && !result.equals("false"); result = scanner.next()) {
            System.out.print(prompt);
        }

        return result;
    }

    public static String validarEmail(String prompt) {
        System.out.print(prompt);

        String result;
        for(result = scanner.next(); !result.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"); result = scanner.next()) {
            System.out.print("Formato inválido, Intente nuevamente: ");
        }

        return result;
    }

    public static String validarTel(String prompt) {
        System.out.print(prompt);

        String result;
        for(result = scanner.next(); !result.matches("^\\d{10}$"); result = scanner.next()) {
            System.out.print("Formato inválido, Intente nuevamente: ");
        }

        return result;
    }

    static {
        scanner = new Scanner(System.in);
    }
}