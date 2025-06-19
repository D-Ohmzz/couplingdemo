package com.loose.refactored;

public class NewDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return "Data from the new database";
    }
    
}
