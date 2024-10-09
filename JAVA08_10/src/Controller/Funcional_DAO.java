/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static View.interface_GUI.valor_txt;
import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio-Info
 */
public class Funcional_DAO {
    
    public static String x=null;
    public static double valor =0;
    
    public static void func(){
        x = View.interface_GUI.nome_txt.getText();
        JOptionPane.showMessageDialog(null,"O nome armazenado é "+ x);
        
        valor = Double.parseDouble(valor_txt.getText());
        JOptionPane.showMessageDialog(null,"O valor armazenado é "+ valor);
    }
    public static void func2(){
        x = View.interface_GUI.nome_txt.getText();
        JOptionPane.showMessageDialog(null,"O nome armazenado é "+ x);
        
        valor = Double.parseDouble(valor_txt.getText());
        JOptionPane.showMessageDialog(null,"O valor armazenado é "+ valor);
    }
}
