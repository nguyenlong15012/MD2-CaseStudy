package com.company.service.Song;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.Song;
import com.company.model.SongName;
import com.company.model.User;
import com.company.service.user_principal.UserPrincipalServiceIMPL;

import java.util.ArrayList;
import java.util.List;

public class ISongServiceIMPL implements ISongService {
    public static String PATH_SONG = ConfigReadAndWriteFile.PATH+"song.txt";
    public static List<Song> songList = new ConfigReadAndWriteFile<Song>().readFromFile(PATH_SONG);
    @Override
    public List<Song> findAll() {
        new ConfigReadAndWriteFile<Song>().writeToFile(PATH_SONG, songList);
        return songList;
    }

    @Override
    public void save(Song song) {
        User user = UserPrincipalServiceIMPL.getInstance().getCurrentUser();
        song.setUser(user);
        songList.add(song);
        //new ConfigReadAndWriteFile<Song>().writeToFile(PATH_SONG, songList);
    }

    @Override
    public Song findBySongName(SongName songName) {

        return null;
    }

//    @Override
//    public void findByIdAlbum(int idAlbum) {
//        List<Song> songListByIdAlbum = new ArrayList<>();
//        songListByIdAlbum.clear();
//        for (int i = 0; i < songList.size(); i++) {
//
//        }
//    }

    @Override
    public List<Song> findByUser() {
        List<Song> songListByUser = new ArrayList<>();
        songListByUser.clear();
        System.out.println("check user current" + new  UserPrincipalServiceIMPL().getCurrentUser().getUsername());
        for (int i = 0; i < songList.size(); i++) {
            System.out.println("i =====> " + i );
            if (new UserPrincipalServiceIMPL().getCurrentUser().getUsername().equals(songList.get(i).getUser().getUsername())){
                songListByUser.add(songList.get(i));
            }
        }
        return songListByUser;
    }


}
