package com.company.view;

import com.company.controller.RoleController;

import java.util.Scanner;

public class RoleView {
    Scanner scanner = new Scanner(System.in);
    RoleController roleController = new RoleController();
    public void showListRole(){
        System.out.println(roleController.showListRole());
        System.out.println("Enter quit back to Menu: ");
        String backMenu = scanner.nextLine();
        if(backMenu.equalsIgnoreCase("quit")){
            new Main();
        }
    }
}
