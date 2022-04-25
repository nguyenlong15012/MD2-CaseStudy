package com.company.view;


import com.company.controller.SongController;
import com.company.model.SongName;
import com.company.service.Song.ISongServiceIMPL;

import java.util.Scanner;

public class ListMusic {
    Scanner sc = new Scanner(System.in);
    SongController songController = new SongController();
//    SongController songController = new SongController();
//    Scanner sc = new Scanner(System.in);
//    public ListMusic(){
//        System.out.println(songController.showListSong());
//        System.out.println("Enter 'quit' back to ListAlbum: ");
//        String backMenu = sc.nextLine();
//        if (backMenu.equalsIgnoreCase("quit")){
//            new ListAlbum();
//        }
//    }
//    public void findByName(SongName songName){
//        System.out.println("Bai hat can tim la");
//
//    }
    public void editSong(){

    }

    public void showListSongByUser() {
        System.out.println(songController.showListSongByUser());
        System.out.println("Nhap bai hat can tim");
        String songName = sc.nextLine();
        boolean check = true;
        for (int i = 0; i <ISongServiceIMPL.songList.size(); i++) {
            if (songName.equalsIgnoreCase(ISongServiceIMPL.songList.get(i).getTenCD()) ){
                check = false;
            }
        }
        if (check){
            System.out.println("Khong tim thay bai hat ban can tim! ");
            showListSongByUser();
        }
        System.out.println(new ISongServiceIMPL().findBySongName(songName));

        System.out.println("===<>===Xóa bài hát theo id===<>===");
        int choice = sc.nextInt();
        new ISongServiceIMPL().Delete(choice);

        System.out.println("Nhap bat ki de tiep tuc hoac 'quit' de thoat: ");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }
    }

//    public void showListAlbumByUser() {
//        System.out.println(albumController.showListAlbumByUser());
//        System.out.println("Enter 'quit' back to Menu: ");
//        String backMenu = sc.nextLine();
//        if (backMenu.equalsIgnoreCase("quit")) {
//            new Main();
//        }
//    }
}
