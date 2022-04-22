package com.company.dto;

public class SongDTO {
    private String tenBH;
    private String tenCaSi;

    public SongDTO() {
    }

    public SongDTO(String tenBH, String tenCaSi) {
        this.tenBH = tenBH;
        this.tenCaSi = tenCaSi;
    }

    public String getTenBH() {
        return tenBH;
    }

    public void setTenBH(String tenBH) {
        this.tenBH = tenBH;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    @Override
    public String toString() {
        return "SongDTO{" +
                "tenBH='" + tenBH + '\'' +
                ", tenCaSi='" + tenCaSi + '\'' +
                '}';
    }
}
