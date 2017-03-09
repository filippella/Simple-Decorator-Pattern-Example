/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern.impl;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author Filippo
 */
public class SimpleHouse implements House {

    @Override
    public void draw(Graphics2D g2D, JComponent component) {
        g2D.setColor(Color.red);
        g2D.fillOval(0, 0, component.getWidth(), component.getHeight());
    }
}
