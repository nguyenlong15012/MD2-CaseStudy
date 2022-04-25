package com.company.view;


import com.company.controller.UserController;
import com.company.dto.SignInDTO;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LoginView {
    Scanner scanner = new Scanner(System.in);
    UserController userController = new UserController();
    public LoginView(){
        System.out.println("===<>===LOGIN FORM===<>===");
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        SignInDTO signInDTO = new SignInDTO(username,password);
        if(userController.login(signInDTO)){
            new ProfileView();
        } else {
            System.err.println("Login failed! Please check username or password! ");
            new LoginView();
        }
    }
}
