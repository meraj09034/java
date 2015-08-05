/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet_project;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Meraj Ali
 */
public class Applet_project extends java.applet.Applet {

    public void init(){}
    public void paint(Graphics g)
    {
        g.drawOval(0,0,205,100);
        g.setColor(Color.yellow);
        g.drawString("meraj hello", 10, 50);
    }
    
}
