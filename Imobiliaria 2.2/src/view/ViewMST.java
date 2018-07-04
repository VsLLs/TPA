/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import javax.swing.JFrame;

/**
 *
 * @author alunocomp
 */
public class ViewMST {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Controller controller = new Controller();
        
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        PrincipalJPanel panel = new PrincipalJPanel(controller);
        panel.setVisible(true);
        frame.setContentPane(panel);
        frame.setVisible(true);
        
    }
    
}
