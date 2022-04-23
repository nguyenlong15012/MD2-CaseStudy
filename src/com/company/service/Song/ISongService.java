package com.company.service.Song;

import com.company.model.Song;
import com.company.model.SongName;
import com.company.service.IServiceGeneric;

import java.util.List;


public interface ISongService extends IServiceGeneric<Song> {
    void save(Song song);
    Song findBySongName(SongName songName);
    //void findByIdAlbum(int idAlbum);

    List<Song> findByUser();
}
