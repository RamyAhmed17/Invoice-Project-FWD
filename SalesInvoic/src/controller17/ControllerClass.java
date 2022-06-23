/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller17;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Baianater 4
 */
public class ControllerClass  implements ActionListener {
    public void actionperformed (ActionEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       String actionCommand =e .getActionCommand();
        System.out.println("Action:"+ actionCommand);
        switch (actionCommand) {
            case "Load File ":
                
                break;
            case "Save File":
                    break;
            case "create new invoice":
                break;
            case "Delete Invoice":
                break;
                case"Delete Item":
                    break;
                case "create new Item":
                    break;
                    
        }
        
    }
    
}
