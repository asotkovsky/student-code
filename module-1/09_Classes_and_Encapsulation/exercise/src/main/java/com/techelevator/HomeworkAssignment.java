package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

    public String getLetterGrade() {
        double numericGrade = (earnedMarks * 100) / possibleMarks;
        if (numericGrade >= 90d) {
            return "A";
        } else if ((numericGrade >= 80d) && (numericGrade <= 89d)) {
            return "B";
        } else if ((numericGrade >= 70d) && (numericGrade <= 79d)) {
            return "C";
        } else if ((numericGrade >= 60d) && (numericGrade <= 69d)) {
            return "D";
        }
        return "F";
    }

    public HomeworkAssignment(int possibleMarks, String submitterName){
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks){
        this.earnedMarks = earnedMarks;
    }

    public String getSubmitterName(){
        return submitterName;
    }

}
