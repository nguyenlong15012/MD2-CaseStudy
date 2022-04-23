package com.company.controller;

import com.company.model.Album;
import com.company.model.Song;
import com.company.service.Song.ISongServiceIMPL;

import java.util.List;

public class SongController {
    ISongServiceIMPL iSongServiceIMPL = new ISongServiceIMPL();

    public List<Song> showListSong() {
        return iSongServiceIMPL.findAll();
    }

    public void writetoSong(Song songDTO) {
//        int id = 1;
//        if (ISongServiceIMPL.songList.size()==0){
//            id = 1;
//        }else {
//            id = ISongServiceIMPL.songList.get(ISongServiceIMPL.songList.size()-1).getMaCD()+1;
//        }
        iSongServiceIMPL.save(songDTO);
        iSongServiceIMPL.findAll();
    }


    public List<Song> showListSongByUser(){
        return iSongServiceIMPL.findByUser();
    }
}
