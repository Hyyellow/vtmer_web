package com.vtmer.domain;

public class User {
    private Integer id;
    private String userHeadImg;
    private String userName;
    private String userSex;
    private String userGrade;
    private String userCollege;
    private String userMajor;
    private String userClass;
    private Integer userQq;
    private Integer userPhone;
    private String userWechar;
    private String userFirstVolunteer;
    private String userSecondVolunteer;
    private String userSelfIntroduction;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userHeadImg='" + userHeadImg + '\'' +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userGrade='" + userGrade + '\'' +
                ", userCollege='" + userCollege + '\'' +
                ", userMajor='" + userMajor + '\'' +
                ", userClass='" + userClass + '\'' +
                ", userQq=" + userQq +
                ", userPhone=" + userPhone +
                ", userWechar='" + userWechar + '\'' +
                ", userFirstVolunteer='" + userFirstVolunteer + '\'' +
                ", userSecondVolunteer='" + userSecondVolunteer + '\'' +
                ", userSelfIntroduction='" + userSelfIntroduction + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserHeadImg() {
        return userHeadImg;
    }

    public void setUserHeadImg(String userHeadImg) {
        this.userHeadImg = userHeadImg == null ? null : userHeadImg.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(String userGrade) {
        this.userGrade = userGrade == null ? null : userGrade.trim();
    }

    public String getUserCollege() {
        return userCollege;
    }

    public void setUserCollege(String userCollege) {
        this.userCollege = userCollege == null ? null : userCollege.trim();
    }

    public String getUserMajor() {
        return userMajor;
    }

    public void setUserMajor(String userMajor) {
        this.userMajor = userMajor == null ? null : userMajor.trim();
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass == null ? null : userClass.trim();
    }

    public Integer getUserQq() {
        return userQq;
    }

    public void setUserQq(Integer userQq) {
        this.userQq = userQq;
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserWechar() {
        return userWechar;
    }

    public void setUserWechar(String userWechar) {
        this.userWechar = userWechar == null ? null : userWechar.trim();
    }

    public String getUserFirstVolunteer() {
        return userFirstVolunteer;
    }

    public void setUserFirstVolunteer(String userFirstVolunteer) {
        this.userFirstVolunteer = userFirstVolunteer == null ? null : userFirstVolunteer.trim();
    }

    public String getUserSecondVolunteer() {
        return userSecondVolunteer;
    }

    public void setUserSecondVolunteer(String userSecondVolunteer) {
        this.userSecondVolunteer = userSecondVolunteer == null ? null : userSecondVolunteer.trim();
    }

    public String getUserSelfIntroduction() {
        return userSelfIntroduction;
    }

    public void setUserSelfIntroduction(String userSelfIntroduction) {
        this.userSelfIntroduction = userSelfIntroduction == null ? null : userSelfIntroduction.trim();
    }
}