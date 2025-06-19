package com.loose.refactored;

public class WebServiceDataProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        //Code that directly accesses the web service to get the user data
        return "Fetching data from web service";
    }
}
