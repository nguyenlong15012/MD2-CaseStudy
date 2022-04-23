package com.company.service.Album;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.Album;
import com.company.model.User;
import com.company.service.user_principal.UserPrincipalServiceIMPL;

import java.util.ArrayList;
import java.util.List;

public class IAlbumServiceIMPL implements IAlbumService{
    public static String PATH_ALBUM = ConfigReadAndWriteFile.PATH+"album.txt";
    public static List<Album> albumList = new ConfigReadAndWriteFile<Album>().readFromFile(PATH_ALBUM);
    @Override
    public List<Album> findAll() {
        new ConfigReadAndWriteFile<Album>().writeToFile(PATH_ALBUM, albumList);
        return albumList;
    }

    @Override
    public void save(Album album) {
        User user = UserPrincipalServiceIMPL.getInstance().getCurrentUser();
        album.setUser(user);
        albumList.add(album);
        //new ConfigReadAndWriteFile<Album>().writeToFile(PATH_ALBUM, albumList);
    }

    @Override
    public Album finByAlbumName(Album album) {
        return null;
    }

    @Override
    public List<Album> findByUser() {
        //System.out.println("goi ham findByUser");
        List<Album> albumListByUser = new ArrayList<>();
        albumListByUser.clear();
        //System.out.println("check current"+new UserPrincipalServiceIMPL().getCurrentUser().getUsername());
        for (int i = 0; i < albumList.size(); i++) {
            //System.out.println("i ==== "+i);
            //System.out.println("check ---> "+new UserPrincipalServiceIMPL().getCurrentUser().getUsername().equals(albumList.get(i).getUser().getUsername()));
            if(new UserPrincipalServiceIMPL().getCurrentUser().getUsername().equals(albumList.get(i).getUser().getUsername())){
                albumListByUser.add(albumList.get(i));
            }
        }
        return albumListByUser;
    }


//    @Override
//    public void save(Album album) {
//        albumList.add(album);
//        new ConfigReadAndWriteFile<Album>().writeToFile(PATH_ALBUM, albumList);
//    }

//    @Override
//    public Album finByAlbumName(AlbumF1 albumF1) {
//        for (int i = 0; i < albumList.size(); i++) {
//            if (albumF1.equals(albumList.get(i).getTenAlbum())){
//                return albumList.get(i);
//            }
//        }
//        return null;
//    }

}
