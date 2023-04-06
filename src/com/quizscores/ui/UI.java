package com.quizscores.ui;

import java.util.Map;

public interface UI {

    /**
     * Displays the menu options:
     * 1. View Students
     * 2. Add student
     * 3. Remove student
     * 4. View quiz scores
     * 5. View average quiz score for single student
     */
    void showMenu();

    /**
     * Displays the student info, such as name and quiz score
     */
    void showStudentInfo(Map<String, Integer> studentMap);

    /**
     * Displays a message if the student couldn't be found
     */
    void showStudentNotFound();

    /**
     * Displays a message upon a successful entry
     */
    void showValidInput();

    /**
     * Displays a message upon invalid input
     */
    void showInvalidInput();

}
