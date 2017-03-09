/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern.gui;

import decoratorpattern.impl.House;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Filippo
 */
public class HousePanel extends JPanel {

    private final House house;

    public HousePanel(House house) {
        this.house = house;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        this.house.draw(g2D, this);
        System.out.println("Invalidating from House Panel");
    }
}
