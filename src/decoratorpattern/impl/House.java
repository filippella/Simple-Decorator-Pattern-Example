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
public interface House {
    
    /**
     * This method is used to do the painting of each decoration
     * 
     * @param g2D
     * @param component 
     */
    void draw(Graphics2D g2D, JComponent component);
}
