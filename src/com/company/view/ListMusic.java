package com.company.view;


import com.company.controller.SongController;

import java.util.Scanner;

public class ListMusic {
    Scanner sc = new Scanner(System.in);
    SongController songController =new SongController();
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

    public void showListSongByUser(){
        System.out.println(songController.showListSongByUser());
        System.out.println("Enter 'quit' back to Menu: ");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("quit")){
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
