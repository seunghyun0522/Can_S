package com.example.kakaomap_personal;

/**
 * Created by kch on 2018. 2. 17..
 */

public class User {
    String userID;
    String userPassword;
    String userTotal;
    String userName;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserTotal() {
        return userTotal;
    }

    public void setUserTotal(String userTotal) {
        this.userTotal = userTotal;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User(String userName, String userTotal ) {

        this.userTotal = userTotal;
        this.userName = userName;
    }
}


