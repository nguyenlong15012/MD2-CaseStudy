package com.company.model;

import java.io.Serializable;

public class Song implements Serializable {
    private int maCD;
    private String tenCD;
    private String caSy;
    private int idAlbum;
    private User user;

    public Song() {
    }

    public Song(int maCD, String tenCD, String caSy, int idAlbum, User user) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.caSy = caSy;
        this.idAlbum = idAlbum;
        this.user = user;
    }

    public Song(int maCD, String tenCD, String caSy, int idAlbum) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.caSy = caSy;
        this.idAlbum = idAlbum;

    }

    public Song(String name, String casi) {
        this.tenCD = name;
        this.caSy = casi;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public int getSoBH() {
        return idAlbum;
    }

    public void setSoBH(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    @Override
    public String toString() {
        return "Song{" +
                "maCD=" + maCD +
                ", tenCD='" + tenCD + '\'' +
                ", caSy='" + caSy + '\'' +
                ", idAlbum=" + idAlbum +
                ", user=" + user +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "Album{" +
//                "maCD=" + maCD +
//                ", tenCD='" + tenCD + '\'' +
//                ", caSy='" + caSy + '\'' +
//                ", soBH=" + soBH +
//                '}' + "\n";
//    }


}
