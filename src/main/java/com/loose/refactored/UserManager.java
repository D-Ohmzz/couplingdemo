package com.loose.refactored;

public class UserManager {
    //Variable of type interface class
    private UserDataProvider userDataProvider; 
    
    public UserManager(UserDataProvider userDataProvider){
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo(){
        //Make use of the method in interface class
        return userDataProvider.getUserDetails();
    }

}
