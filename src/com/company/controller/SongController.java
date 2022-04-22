package com.company.controller;

import com.company.model.Song;
import com.company.service.Song.ISongServiceIMPL;

import java.util.List;

public class SongController {
    ISongServiceIMPL albumServiceIMPL = new ISongServiceIMPL();

    public List<Song> showListSong() {
        return albumServiceIMPL.findAll();
    }

    public void writetoSong(Song songDTO) {
//        int id = 1;
//        if (ISongServiceIMPL.songList.size()==0){
//            id = 1;
//        }else {
//            id = ISongServiceIMPL.songList.get(ISongServiceIMPL.songList.size()-1).getMaCD()+1;
//        }
        albumServiceIMPL.save(songDTO);
        albumServiceIMPL.findAll();
    }
}
