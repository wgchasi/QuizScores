package com.quizscores.io;

import com.quizscores.io.UserIO;

import java.util.Scanner;

public class UserIOImpl implements UserIO {

    Scanner scanner = new Scanner(System.in);

    /**
     * Print a given String to the console
     *
     * @param msg the String to be printed to console
     */
    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    /**
     * Displays a String to prompt the user for input
     * Then reads-in input from the user, and returns input
     *
     * @param prompt The prompt to be printed to console
     * @return The input from user
     */
    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    /**
     * Displays a String to prompt the user for input
     * Then reads-in input from the user, and returns input
     *
     * @param prompt The prompt to be printed to console
     * @return The input from user
     */
    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    /**
     * Displays a String to prompt the user for input
     * User input must wall within the range of min and max
     * Then reads-in input from the user, and returns input
     *
     * @param prompt The prompt to be printed to console
     * @param min    The minimum value that user's input must fall under
     * @param max    The maximum value that user's input can be
     * @return The input from user.
     */
    @Override
    public int readInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int input = scanner.nextInt();

        while (input < min || input > max) {
            System.out.println("Try again");
            input = scanner.nextInt();
        }
        return input;
    }

    /**
     * Displays a String to prompt the user for input
     * Then reads-in input from the user, and returns input
     *
     * @param prompt The prompt to be printed to console
     * @return The input from user
     */
    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    /**
     * Displays a String to prompt the user for input
     * User input must wall within the range of min and max
     * Then reads-in input from the user, and returns input
     *
     * @param prompt The prompt to be printed to console
     * @param min    The minimum value that user's input must fall under
     * @param max    The maximum value that user's input can be
     * @return The input from user
     */
    @Override
    public double readDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double input = -1D;

        do {
            input = scanner.nextDouble();
        } while (input < min || input > max);
        return input;
    }

    /**
     * Displays a String to prompt the user for input
     * Then reads-in input from the user, and returns input
     *
     * @param prompt The prompt to be printed to console
     * @return The input from user
     */
    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        return scanner.nextFloat();
    }

    /**
     * Displays a String to prompt the user for input
     * User input must wall within the range of min and max
     * Then reads-in input from the user, and returns input
     *
     * @param prompt The prompt to be printed to console
     * @param min    The minimum value that user's input must fall under
     * @param max    The maximum value that user's input can be
     * @return The input from user
     */
    @Override
    public float readFloat(String prompt, float min, float max) {
        System.out.println(prompt);
        float input = -1;

        do {
            input = scanner.nextFloat();
        } while (input < min || input > max);
        return input;
    }

    /**
     * Displays a String to prompt the user for input
     * Then reads-in input from the user, and returns input
     *
     * @param prompt The prompt to be printed to console
     * @return The input from user
     */
    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        return scanner.nextLong();
    }

    /**
     * Displays a String to prompt the user for input
     * User input must wall within the range of min and max
     * Then reads-in input from the user, and returns input
     *
     * @param prompt The prompt to be printed to console
     * @param min    The minimum value that user's input must fall under
     * @param max    The maximum value that user's input can be
     * @return The input from user
     */
    @Override
    public long readLong(String prompt, long min, long max) {
        System.out.println(prompt);
        long input = -1;

        do {
            input = scanner.nextLong();
        } while (input < min || input > max);
        return input;
    }
}
