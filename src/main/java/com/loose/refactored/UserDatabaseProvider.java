package com.loose.refactored;
// A - MYSQL, PostgreSQL
// B - Webservice, MongoDB

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        //Code that directly accesses the database to get user data
        return "User Details from the database";
    }

}
