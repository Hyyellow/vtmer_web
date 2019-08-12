package com.vtmer.domain;

public class State {
    private Integer id;
    private String firstVolunteer;
    private String secondVolunteer;
    private Integer userId;

    @Override
    public String toString() {
        return "State{" +
                "id=" + id +
                ", firstVolunteer='" + firstVolunteer + '\'' +
                ", secondVolunteer='" + secondVolunteer + '\'' +
                ", userId=" + userId +
                '}';
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstVolunteer() {
        return firstVolunteer;
    }
    public void setFirstVolunteer(String firstVolunteer) {
        this.firstVolunteer = firstVolunteer == null ? null : firstVolunteer.trim();
    }
    public String getSecondVolunteer() {
        return secondVolunteer;
    }
    public void setSecondVolunteer(String secondVolunteer) {
        this.secondVolunteer = secondVolunteer == null ? null : secondVolunteer.trim();
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}