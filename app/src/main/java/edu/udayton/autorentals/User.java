package edu.udayton.autorentals;

public class User {

    String fName;
    String lName;
    String email;
    String confirmEmail;
    String pw;
    String confirmPw;

User(String fName, String lName, String email, String confirmEmail, String pw, String confirmPw){
    this.fName = fName;
    this.lName = lName;
    this.email = email;
    this.confirmEmail = confirmEmail;
    this.pw = pw;
    this.confirmPw = confirmPw;
}
}
