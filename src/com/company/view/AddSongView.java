package com.company.view;

import com.company.controller.SongController;
import com.company.dto.SongDTO;
import com.company.model.Song;
import com.company.service.Album.IAlbumServiceIMPL;
import com.company.service.Song.ISongServiceIMPL;

import java.util.Scanner;

public class AddSongView {
    Scanner sc = new Scanner(System.in);
    SongController songController = new SongController();
    ISongServiceIMPL iSongServiceIMPL = new ISongServiceIMPL();

    public AddSongView(){
        int id;
        if (ISongServiceIMPL.songList.size()==0){
            id = 1;
        }else {
            id = ISongServiceIMPL.songList.get(ISongServiceIMPL.songList.size()-1).getMaCD()+1;
        }
        new ISongServiceIMPL().findAll();
        System.out.println("Them Bai Hat");
        System.out.println("Nhap ten bai hat: ");
        String name = sc.nextLine();
        System.out.println("Nhap ten ca si: ");
        String casi = sc.nextLine();
        System.out.println("Nhap so BH: ");
        int soBH = sc.nextInt();

        Song song = new Song(id,name, casi, soBH);
        songController.writetoSong(song);

        System.out.println("Enter 'quit' to back");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("quit")){
            new Main();
        }
    }
}
