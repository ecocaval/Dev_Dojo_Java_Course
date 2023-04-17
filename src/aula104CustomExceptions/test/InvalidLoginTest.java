package aula104CustomExceptions.test;

import aula104CustomExceptions.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginTest {
    public static void main (String[] args) {
        try {
            login();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
        System.out.println("End of program");
    }

    private static void login() throws InvalidLoginException{
        Scanner scanner = new Scanner(System.in);
        String usernameDb = "luffy";
        String passwordDb = "pirata";
        System.out.println("Username: ");
        String usernameWritten = scanner.nextLine();
        System.out.println("Password: ");
        String passwordWritten = scanner.nextLine();
        if (!usernameDb.equals(usernameWritten) || !passwordDb.equals(passwordWritten)) {
            throw new InvalidLoginException("Invalid login");
        }
        System.out.println("Welcome");
    }
}
