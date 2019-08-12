package com.vtmer.domain;

public class Interview {
    private Integer id;
    private Integer userId;
    private String writtenExamination;
    private String firstInterview;
    private String secondInterview;
    private String firstAssessment;
    private String secondAssessment;

    @Override
    public String toString() {
        return "Interview{" +
                "id=" + id +
                ", userId=" + userId +
                ", writtenExamination='" + writtenExamination + '\'' +
                ", firstInterview='" + firstInterview + '\'' +
                ", secondInterview='" + secondInterview + '\'' +
                ", firstAssessment='" + firstAssessment + '\'' +
                ", secondAssessment='" + secondAssessment + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getWrittenExamination() {
        return writtenExamination;
    }
    public void setWrittenExamination(String writtenExamination) {
        this.writtenExamination = writtenExamination == null ? null : writtenExamination.trim();
    }
    public String getFirstInterview() {
        return firstInterview;
    }
    public void setFirstInterview(String firstInterview) {
        this.firstInterview = firstInterview == null ? null : firstInterview.trim();
    }
    public String getSecondInterview() {
        return secondInterview;
    }
    public void setSecondInterview(String secondInterview) {
        this.secondInterview = secondInterview == null ? null : secondInterview.trim();
    }
    public String getFirstAssessment() {
        return firstAssessment;
    }
    public void setFirstAssessment(String firstAssessment) {
        this.firstAssessment = firstAssessment == null ? null : firstAssessment.trim();
    }
    public String getSecondAssessment() {
        return secondAssessment;
    }
    public void setSecondAssessment(String secondAssessment) {
        this.secondAssessment = secondAssessment == null ? null : secondAssessment.trim();
    }
}