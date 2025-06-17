package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args){
        //Creating an object instace of the user data provider interface
        //and assigning it to an object of the userdatabaseprovider class
        UserDataProvider dataBaseProvider = new UserDatabaseProvider(); 

        //Creating an object instace of the user data provider interface
        //and assigning it to an object of the webserviceprovider class
        UserDataProvider webServiceProvider = new WebServiceDataProvider();

        //Creating an object instace of the user data provider interface
        //and assigning it to an object of the new database serviceprovider class
        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();

        UserManager userManagerWithDB =  new UserManager(dataBaseProvider);
        UserManager userManagerWithWeb = new UserManager(webServiceProvider);
        UserManager userManagerWithNewDB =  new UserManager(newDatabaseProvider);

        
        System.out.println("Data from web service: "+userManagerWithWeb.getUserInfo());
        System.out.println("Data from database: "+userManagerWithDB.getUserInfo());
        System.out.println("Data from new database: "+userManagerWithNewDB.getUserInfo());
    }
}