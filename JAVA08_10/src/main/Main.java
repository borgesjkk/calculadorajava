/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import View.interface_GUI;

/**
 *
 * @author Laboratorio-Info
 */
public class Main {

    
    public static void main(String[] args) {
        interface_GUI chama = new interface_GUI();
        chama.setVisible(true);
        new interface_GUI().setVisible(true);
    }
   
}
