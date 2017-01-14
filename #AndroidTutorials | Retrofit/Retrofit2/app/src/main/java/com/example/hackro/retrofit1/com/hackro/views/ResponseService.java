package com.example.hackro.retrofit1.com.hackro.views;

/**
 * Created by hackro on 10/01/17.
 */



public class ResponseService {

    private int iD;
    private String name;
    private String lastName;
    private String nickName;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResponseService() {
    }

    /**
     *
     * @param iD
     * @param lastName
     * @param nickName
     * @param name
     */
    public ResponseService(int iD, String name, String lastName, String nickName) {
        super();
        this.iD = iD;
        this.name = name;
        this.lastName = lastName;
        this.nickName = nickName;
    }

    public int getId() {
        return iD;
    }

    public void setId(int id) {
        this.iD = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

}