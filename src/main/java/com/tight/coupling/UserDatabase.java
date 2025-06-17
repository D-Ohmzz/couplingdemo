package com.tight.coupling;

public class UserDatabase {
    public String getUserDetails(){
        //code directly accessing the database
        return "User Details from the database";
    }

}
