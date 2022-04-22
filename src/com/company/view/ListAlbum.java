package com.company.view;

import com.company.controller.AlbumController;

import java.util.Scanner;

public class ListAlbum {
    Scanner sc = new Scanner(System.in);
        AlbumController albumController = new AlbumController();
    public ListAlbum(){
        System.out.println(albumController.showListAlbum());
       // System.out.println(IAlbumServiceIMPL.albumList);
        System.out.println("1 Show list album");
        System.out.println("Enter 'quit' back to Menu: ");
        String backMenu = sc.nextLine();

        if (backMenu.equalsIgnoreCase("quit")){
            new Main();
        }

        System.out.println("1. Album 1");
        int choice = sc.nextInt();
        switch (choice){
            case 1: new ListMusic();
                break;

        }
    }
}
