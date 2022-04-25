package com.company.service.Song;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.Song;
import com.company.model.User;
import com.company.service.Album.IAlbumServiceIMPL;
import com.company.service.user_principal.UserPrincipalServiceIMPL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ISongServiceIMPL implements ISongService {
    Scanner sc = new Scanner(System.in);
    public static String PATH_SONG = ConfigReadAndWriteFile.PATH+"song.txt";
    public static List<Song> songList = new ConfigReadAndWriteFile<Song>().readFromFile(PATH_SONG);
    IAlbumServiceIMPL iAlbumServiceIMPL = new IAlbumServiceIMPL();
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
    public Song findBySongName(String songName) {
        int id = 0;
        for (int i = 0; i < songList.size(); i++) {
            if (songName.equals(songList.get(i).getTenCD())){
                id = i;
            }
        }
        return songList.get(id);
    }

    @Override
    public void findByIdAlbum(int idAlbum) {
        List<Song> songListByIdAlbum = new ArrayList<>();
        songListByIdAlbum.clear();
        for (int i = 0; i < songList.size(); i++) {
            if (songList.get(i).getIdAlbum()==idAlbum){
                System.out.println(songList.get(i));
            }
        }
    }

    @Override
    public void Delete(int id) {
        String checkName = null;
        for (int i = 0; i < songList.size(); i++) {
            if (id == songList.get(i).getMaCD()){
                songList.remove(i);
                System.out.println("Delete successfully");
                findAll();
            }
        }

    }

    @Override
    public void editSongById(int id, String tenCD, String tenCaSi, int idAlbum) {
        for (int i = 0; i < songList.size(); i++) {
            if (id == songList.get(i).getMaCD()){
                songList.get(i).setMaCD(id);
                songList.get(i).setTenCD(tenCD);
                songList.get(i).setCaSy(tenCaSi);
                songList.get(i).setIdAlbum(idAlbum);
            }
        }
    }

    @Override
    public List<Song> findByUser() {
        List<Song> songListByUser = new ArrayList<>();
        songListByUser.clear();
//        System.out.println("check user current" + new  UserPrincipalServiceIMPL().getCurrentUser().getUsername());
        for (int i = 0; i < songList.size(); i++) {
//            System.out.println("i =====> " + i );
            if (new UserPrincipalServiceIMPL().getCurrentUser().getUsername().equals(songList.get(i).getUser().getUsername())){
                songListByUser.add(songList.get(i));
            }
        }
        return songListByUser;
    }


}
