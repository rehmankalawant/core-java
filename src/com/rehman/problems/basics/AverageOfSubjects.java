package com.rehman.problems.basics;

public class AverageOfSubjects {
    public static void main(String[] args) {

        int marathi = 92, sanskrit = 86, english = 92, science = 92, history = 66;
        int numberOfSubjects = 5;

        int sumOfAllSubjects = marathi + sanskrit + english + science + history;

        int averageOfAllSubject = sumOfAllSubjects / numberOfSubjects;

        System.out.println("Average of all subject is " + averageOfAllSubject);
    }
}