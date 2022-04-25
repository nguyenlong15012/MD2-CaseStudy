package com.company.service.Album;

import com.company.model.Album;
import com.company.service.IServiceGeneric;

import java.util.List;


public interface  IAlbumService extends IServiceGeneric<Album> {

    //    @Override
//    void save(Album album);

    Album finByAlbumName(Album album);
    List<Album> findByUser();
    void findById(int id);
    void Delete(int id);
}
