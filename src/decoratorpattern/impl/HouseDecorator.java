/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern.impl;

import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author Filippo
 */
public abstract class HouseDecorator implements House {

    private final House house;
    
    public HouseDecorator(House house) {
        this.house = house;
    }
    
    @Override
    public void draw(Graphics2D g2D, JComponent component) {
        this.house.draw(g2D, component);
    }
}
