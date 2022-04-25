package com.company.model;

import java.io.Serializable;

public class Album implements Serializable {
    private int id;
    private String tenAlbum;
    private String caSiAlbum;
    private String hinhAnhAlbum;
    private User user;

    public Album() {
    }

    public Album(int id, String tenAlbum, String caSiAlbum, String hinhAnhAlbum, User user) {
        this.id = id;
        this.tenAlbum = tenAlbum;
        this.caSiAlbum = caSiAlbum;
        this.hinhAnhAlbum = hinhAnhAlbum;
        this.user = user;
    }

    public Album(String tenAlbum, String caSiAlbum) {
        this.tenAlbum = tenAlbum;
        this.caSiAlbum = caSiAlbum;
    }

    public Album(int id, String tenAlbum, String caSiAlbum, String hinhAnhAlbum) {
        this.id = id;
        this.tenAlbum = tenAlbum;
        this.caSiAlbum = caSiAlbum;
        this.hinhAnhAlbum = hinhAnhAlbum;
    }

    public Album(int id, String tenAlbum, String caSiAlbum) {
        this.id = id;
        this.tenAlbum = tenAlbum;
        this.caSiAlbum = caSiAlbum;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenAlbum() {
        return tenAlbum;
    }

    public void setTenAlbum(String tenAlbum) {
        this.tenAlbum = tenAlbum;
    }

    public String getCaSiAlbum() {
        return caSiAlbum;
    }

    public void setCaSiAlbum(String caSiAlbum) {
        this.caSiAlbum = caSiAlbum;
    }

    public String getHinhAnhAlbum() {
        return hinhAnhAlbum;
    }

    public void setHinhAnhAlbum(String hinhAnhAlbum) {
        this.hinhAnhAlbum = hinhAnhAlbum;
    }

    @Override
    public String toString() {
        return String.format("\tID: %1s %1s TenAlbum: %25s %1s CaSiAlbum %13s %1s HinhAnhAlbum %2s %1s User: %20s", id, "|",tenAlbum,"|",caSiAlbum,"|",hinhAnhAlbum,"|",user);
    }

    //    @Override
//    public String toString() {
//        return "Album{" +
//                "id=" + id +
//                ", tenAlbum='" + tenAlbum + '\'' +
//                ", caSiAlbum='" + caSiAlbum + '\'' +
//                ", hinhAnhAlbum='" + hinhAnhAlbum + '\'' +
//                '}'+"\n";
//    }
}
