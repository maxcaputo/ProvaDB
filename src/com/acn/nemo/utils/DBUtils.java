package com.acn.nemo.utils;

import java.sql.Connection;

public class DBUtils {

    private String url;
    private String username;
    private String password;

    private static Connection connection;
    //Contiene i metodi per accedere al DB
    //dammi la connesione
    //chiudi la connesione


    //Singleton



    public static Connection getConnectio(){
        return connection;
    }

    public void closeConnection(){}
}
