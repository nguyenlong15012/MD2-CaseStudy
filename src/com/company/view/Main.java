package com.company.view;

import com.company.model.Role;
import com.company.model.RoleName;
import com.company.model.UserPrincipal;
import com.company.service.user_principal.UserPrincipalServiceIMPL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public Main() {
        Scanner sc = new Scanner(System.in);
        List<UserPrincipal> userPrincipalList = UserPrincipalServiceIMPL.userPrincipalList;
        boolean checkLogin = false;
        Set<Role> roleSet = userPrincipalList.get(0).getRoleSet();
        List<Role> roleList = new ArrayList<>(roleSet);
        //System.out.println("roleList ===== " + roleList);
        boolean checkAdmin = roleList.get(0).getName() == RoleName.ADMIN;

        System.out.println("=================== MY NAVBAR ==================");
        System.out.println("Welcome Profile: "+userPrincipalList.get(0).getName());
        if (userPrincipalList.size() != 0) {
            checkLogin = true;
        } else {
            checkLogin = false;
        }
        if (!checkLogin) {
            System.out.println("1. Register");
            System.out.println("2. Login");
        } else {

            System.out.println("3. Show List Role");
            System.out.println("5. My Profile");
            System.out.println("6. Add Album");
            System.out.println("7. Add Song");
            System.out.println("8. Show List Album");

            if (checkAdmin) {
                System.out.println("4. Show List User");
            }
        }


        int chooseMenu = sc.nextInt();
        switch (chooseMenu) {
            case 1:
                new RegisterView();
                break;
            case 2:
                new LoginView();
                break;
            case 3:
                new RoleView().showListRole();
                break;
            case 4:
                if (checkAdmin) {
                    new ListUserView();
                    break;
                } else {
                    System.out.println("You have not permission! ");
                    new Main();
                }

            case 5:
                new ProfileView();
                break;
            case 6:
                new AddAlbumView();
                break;
            case 7:
                new AddSongView();
                break;
            case 8:
                new ListAlbum();
                break;
        }

        //Tren

//            List<UserPrincipal> userPrincipalList = UserPrincipalServiceIMPL.userPrincipalList;
//    //        UserPrincipalServiceIMPL userPrincipalServiceIMPL = new UserPrincipalServiceIMPL();
//            Scanner sc = new Scanner(System.in);
//            if (new UserPrincipalServiceIMPL().findAll().size() != 0) {
//            System.out.println("Welcome Profile: " + userPrincipalList.get(0).getName());
//            Set<Role> roleSet = new UserPrincipalServiceIMPL().findAll().get(0).getRoleSet();
//            List<Role> roleList = new ArrayList<>(roleSet);
//            boolean checkAdmin = roleList.get(0).getName() == RoleName.ADMIN;
//            if (roleList.get(0).getName() == RoleName.ADMIN) {
//                System.out.println("=================== MY NAVBAR ==================");
//                System.out.println("3. Show List Role");
//                System.out.println("4. Show list User");
//                System.out.println("5. My Profile");
//                System.out.println("6. Add Album");
//                System.out.println("7. Add Song");
//                System.out.println("8. Show List Album");
//                int chooseMenu = sc.nextInt();
//                switch (chooseMenu) {
//                    case 1:
//                        new RegisterView();
//                        break;
//                    case 2:
//                        new LoginView();
//                        break;
//                    case 3:
//                        new RoleView().showListRole();
//                        break;
//                    case 4:
//                        if (checkAdmin) {
//                            new ListUserView();
//                            break;
//                        } else {
//                            System.out.println("Admin moi co quyen xem! ");
//                            new Main();
//                        }
//
//                    case 5:
//                        new ProfileView();
//                        break;
//                    case 6:
//                        new AddAlbumView();
//                        break;
//                    case 7:
//                        new AddSongView();
//                        break;
//                    case 8:
//                        new ListAlbum();
//                        break;
//                }
//
//            }
//
//        } else {
//            System.out.println("Khong co dang nhap");
//            System.out.println("1. REGISTER");
//            System.out.println("2. LOGIN");
//            int choice = sc.nextInt();
//            switch (choice){
//                case 1:
//                    new RegisterView();
//                    break;
//                case 2:
//                    new LoginView();
//                    break;
//            }
//        }
    }

    public static void main(String[] args) {

        new Main();
        //new RegisterAndLoginView();
    }
}

