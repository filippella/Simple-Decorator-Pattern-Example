/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

import decoratorpattern.gui.HousePanel;
import decoratorpattern.impl.House;
import decoratorpattern.impl.Option;
import decoratorpattern.impl.SimpleHouse;
import decoratorpattern.impl.Window;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Filippo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Option option = new Option.Builder()
                .setFirstName("Filippo")
                .setLastName("Engidashet")
                .setIdNumber("12345")
                .setDateOfBirth("01/05/1988")
                .build();
        
        String firstName = option.getFirstName();
        
        JFrame house = new JFrame("My Sweet House");
        House customizedHouse = new Window(new SimpleHouse());
        
        HousePanel housePanel = new HousePanel(customizedHouse);
        housePanel.setPreferredSize(new Dimension(350, 550));
        
        house.add(housePanel);
        house.pack();
        
        house.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        house.setLocationRelativeTo(null);
        house.setVisible(true);
    }
}
