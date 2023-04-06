package com.quizscores.ui;

import com.quizscores.io.UserIOImpl;

import java.util.Map;
import java.util.Set;

public class ConsoleUI implements UI {
    private UserIOImpl io;

    public ConsoleUI(UserIOImpl io) {
        this.io = io;
    }
    /**
     * Displays the menu options:
     * 1. View Students
     * 2. Add student
     * 3. Remove student
     * 4. View quiz scores
     * 5. View average quiz score for single student
     */
    @Override
    public void showMenu() {
        System.out.println("1. View students");
        System.out.println("2. Add student");
        System.out.println("3. Remove student");
        System.out.println("4. View quiz scores");
        System.out.println("5. View single student average quiz score");

        io.readInt("Your option: ", 1, 5);
    }

    /**
     * Displays the student info, such as name and quiz score
     */
    @Override
    public void showStudentInfo(Map<String, Integer> studentMap) {
        System.out.println("==========\nStudent Information\n");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();

        for (Map.Entry<String, Integer> e : entries) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        System.out.println("----------\n");
    }

    /**
     * Displays a message if the student couldn't be found
     */
    @Override
    public void showStudentNotFound() {
        System.out.println("ERROR. Student not found.");
    }

    /**
     * Displays a message upon a successful entry
     */
    @Override
    public void showValidInput() {
        System.out.println("Input successful");
    }

    /**
     * Displays a message upon invalid input
     */
    @Override
    public void showInvalidInput() {
        System.out.println("Invalid input");
    }
}
