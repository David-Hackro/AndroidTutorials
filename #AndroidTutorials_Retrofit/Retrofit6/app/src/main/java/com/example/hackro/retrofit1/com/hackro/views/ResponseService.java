package com.example.hackro.retrofit1.com.hackro.views;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by hackro on 10/01/17.
 */



public class ResponseService {
    @SerializedName("id_user")
    @Expose
    private int id;
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
     * @param id
     * @param lastName
     * @param nickName
     * @param name
     */
    public ResponseService(int id, String name, String lastName, String nickName) {
        super();
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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