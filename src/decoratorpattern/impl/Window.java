/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern.impl;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JComponent;

/**
 *
 * @author Filippo
 */
public class Window extends HouseDecorator {

    private JComponent component;

    public Window(House house) {
        super(house);
    }

    @Override
    public void draw(Graphics2D g2D, JComponent component) {
        super.draw(g2D, component);
        this.component = component;
        g2D.setColor(Color.YELLOW);
        int halfWidth = component.getWidth() / 2;
        int halfHeight = component.getHeight() / 2;
        g2D.fillRect(halfWidth / 2, halfHeight / 2, halfWidth, halfHeight);
        component.invalidate();
        System.out.println("Invalidating from window");
        component.setLayout(new FlowLayout(FlowLayout.LEADING));
        component.add(new JButton("Window"));
    }

    public void repaint() {
        this.component.repaint();
    }
}
