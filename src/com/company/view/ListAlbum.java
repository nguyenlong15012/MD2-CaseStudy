package com.company.view;

import com.company.controller.AlbumController;
import com.company.service.Song.ISongServiceIMPL;

import java.util.Scanner;

public class ListAlbum {
    Scanner sc = new Scanner(System.in);
    AlbumController albumController = new AlbumController();

    //    public ListAlbum(){
////        System.out.println(albumController.showListAlbum());
//       // System.out.println(IAlbumServiceIMPL.albumList);
//        System.out.println("1 Show list album");
//        System.out.println("Enter 'quit' back to Menu: ");
//        String backMenu = sc.nextLine();
//
//        if (backMenu.equalsIgnoreCase("quit")){
//            new Main();
//        }
//
//        System.out.println("1. Album 1");
//        int choice = sc.nextInt();
//        switch (choice){
//            case 1: new ListMusic();
//                break;
//
//        }
//    }
    public void showListAlbumByUser() {
        System.out.println(albumController.showListAlbumByUser());
        System.out.println("===<>=== Xem chi tiet Album ===<>===");
        System.out.println("1. Album Le Bao Binh");
        System.out.println("2. Album hien Ho");
        System.out.println("3. Album Khac Viet");
        System.out.println("4. Album Vu Duy Khanh");
        System.out.println("5. Album Mr.Siro ♥♥♥♥♥♥");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                new ISongServiceIMPL().findByIdAlbum(choice);
                break;
            case 2:
                new ISongServiceIMPL().findByIdAlbum(choice);
                break;
            case 3:
                new ISongServiceIMPL().findByIdAlbum(choice);
                break;
            case 4:
                new ISongServiceIMPL().findByIdAlbum(choice);
                break;
            case 5:
                new ISongServiceIMPL().findByIdAlbum(choice);
                break;
        }
        System.out.println("Enter 'quit' back to Menu: ");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }
    }
}
