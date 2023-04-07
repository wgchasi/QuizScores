package com.quizscores.service;

import com.quizscores.models.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Provides services for managing students and their quiz scores.
 * Maintains a map of student names and their corresponding score lists.
 */
public class StudentService {
    private Map<String, List<Integer>> db = new HashMap<>();


    /**
     * Adds a new student to the system's DB
     * If Student object contains a null score list, an empty List is created and put in the system's map instead
     * @param student A Student object
     */
    public void addStudent(Student student) {
        if (student.getScoreList() == null) {
            db.put(student.getName(), new ArrayList<>());
            return;
        }
        db.put(student.getName(), student.getScoreList());
    }

    /**
     * Adds a new student to system's DB.
     * Made for passing an external score list.
     * If passed a null scoreList, an empty List is created and put in the system's map instead
     * @param student A Student object
     * @param scoreList Student's list of quiz scores
     */
    public void addStudent(Student student, List<Integer> scoreList) {
        if (scoreList == null) {
            db.put(student.getName(), new ArrayList<>());
            return;
        }
        db.put(student.getName(), scoreList);
    }

    /**
     * Removed a student from the system's DB.
     * Returns a boolean indication success or failure.
     * @param student A Student object
     */
    public boolean removeStudent(Student student) {
        return db.remove(student.getName()) != null;
    }

    /**
     * Returns the current map (DB)
     * @return HashMap containing students and scores
     */
    public Map<String, List<Integer>> getStudentMap() {
        return db;
    }

    /**
     * Returns a list of all student names in the system's DB.
     * @return List of Strings representing student names
     */
    public List<String> getStudentList() {
        return new ArrayList<>(db.keySet());
    }

    /**
     * Returns a list of all quiz scores stored in the system's DB.
     * @return List of Integers representing quiz scores
     */
    public List<Integer> getStudentScores() {
        List<Integer> scores = new ArrayList<>();

        for(List<Integer> list: db.values()) {
            scores.addAll(list);
        }
        return scores;
    }
}
