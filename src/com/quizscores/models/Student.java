package com.quizscores.models;

import com.quizscores.exceptions.NullScoreListException;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> scoreList = new ArrayList<>();

    public Student(String name) {
        if (name ==  null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        this.name = name;
    }

    public Student (String name, List<Integer> scoreList) {
        if (name ==  null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (scoreList == null) {
            throw new NullScoreListException("Cannot pass a null scoreList");
        }

        this.name = name;
        this.scoreList = scoreList;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getScoreList() {
        if (scoreList == null)
            throw new NullScoreListException("Requested scoreList is null");

        return scoreList;
    }
}
