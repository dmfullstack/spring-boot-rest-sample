package com.learn.model;

public class SubmissionAssignment extends Assignment {

    public AssignmentType type = AssignmentType.SUBMISSION;

    private boolean peerReviewEnabled;

    /**
     * @return the peerReviewEnabled
     */
    public boolean isPeerReviewEnabled() {
        return peerReviewEnabled;
    }

    /**
     * @param peerReviewEnabled
     *            the peerReviewEnabled to set
     */
    public void setPeerReviewEnabled(final boolean peerReviewEnabled) {
        this.peerReviewEnabled = peerReviewEnabled;
    }
}