package com.learn.model;

public class QuizAssignment extends Assignment {

    public AssignmentType type = AssignmentType.QUIZ;

    private boolean autoGraded;

    /**
     * @return the autoGraded
     */
    public boolean isAutoGraded() {
        return autoGraded;
    }

    /**
     * @param autoGraded
     *            the autoGraded to set
     */
    public void setAutoGraded(final boolean autoGraded) {
        this.autoGraded = autoGraded;
    }
}
