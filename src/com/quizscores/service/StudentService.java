package com.quizscores.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A class defining what a student is. A student has the following behaviour:
 * Score - each student has a score on a quiz
 *
 */
public class StudentService {
    private Map<String, Integer> db = new HashMap<>();


    /**
     * Adds a new student to the system's DB
     * Doesn't add a score. Score defaults to -1
     * @param name Student's name
     */
    public void addStudent(String name) {
        db.put(name, -1);
    }

    /**
     * Adds a new student to system's DB
     * Adds a score
     * @param name Student's name
     * @param score Student's quiz score
     */
    public void addStudent(String name, int score) {
        db.put(name, score);
    }

    /**
     * Removed a student from the system's DB
     * @param name Student's name
     */
    public void removeStudent(String name) {
        db.remove(name);
    }

    /**
     * Returns the current map (DB)
     * @return HashMap containing students and scores
     */
    public Map<String, Integer> getStudentMap() {
        return db;
    }

    public List<String> getStudentList() {
        return new ArrayList<>(db.keySet());
    }

    public List<Integer> getStudentScores() {
        return new ArrayList<>(db.values());
    }
}
