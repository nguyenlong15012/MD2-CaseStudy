package com.company.view;


import com.company.controller.SongController;
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

    public void showListSongByUser() {
        System.out.println(songController.showListSongByUser());
        System.out.println("===<>===Xóa bài hát theo id===<>===");

        int choice = sc.nextInt();
        new ISongServiceIMPL().Delete(choice);
//        switch (choice) {
//            case 1:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 2:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 3:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 4:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 5:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 6:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 7:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 8:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 9:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 10:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 11:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 12:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 13:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 14:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 15:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 16:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 17:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 18:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 19:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 20:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 21:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 22:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 23:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 24:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 25:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 26:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 27:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 28:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 29:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 30:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 31:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 32:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 33:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 34:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 35:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 36:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 37:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 38:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 39:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 40:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//            case 41:
//                new ISongServiceIMPL().Delete(choice);
//                break;
//        }
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
