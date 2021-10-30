/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.Controller;
import java.util.ArrayList;
import model.*;
import view.*;
/**
 *
 * @author Nicholas Russel
 */
public class Main {
    public Main() {
        Controller controller =  new Controller();
        ArrayList<Person> users = controller.getAllKasirs();
        for (Person user : users) {
            System.out.println(user.toString());
        }
        ArrayList<Kehadiran> hadir = controller.getAllKehadiran();
        for (Kehadiran absen : hadir) {
            System.out.println(absen.toString());
        }
//        User newUser = new User();
//        newUser.setName("Heru");
//        newUser.setAddress("jl Dago");
//        newUser.setAge(15);
//        newUser.setPhone("1234567");
//        
//        boolean status = controller.insertNewUser(newUser);
//        if(status){
//            System.out.println("insert sukses");
//        } else {
//            System.out.println("insert gagal");
//        }
//        System.out.println(controller.getAllUsers());
    }
    
    public static void main(String[] args) {
        new view.MenuLogin();
       new Main();
       
    }
}
