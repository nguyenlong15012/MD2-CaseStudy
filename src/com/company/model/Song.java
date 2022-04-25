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

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    @Override
    public String toString() {
        return String.format("\tID: %1s %1s TenBH: %25s %1s TenCaSi: %13s %1s ID Album: %2s %1s User: %20s \n", maCD,"|", tenCD,"|", caSy,"|", idAlbum,"|" ,user );

//        return "id = "+ maCD +"\t ||"+ "\t" +
//               tenCD  +"\t ||"+"\t" +
//                 caSy  +"\t ||"+"\t" +
//                "idAlbum ="+idAlbum +"\t $$"+"\t" +
//                 user +"\n ||"+"\t"
//                ;
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
