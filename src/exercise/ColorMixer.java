/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author Juan Pablo Lagos
 */
public class ColorMixer extends JInternalFrame
{
    private JLabel mix;
    private JScrollBar red, green, blue;
    
    //--------------------------------------------------------------------------
    
    public ColorMixer()
    {
        super("Color Mixer",false,true,false,true);
        setSize(300,200);
        widgets();
        events();
        setVisible(true);
    }
    
    //--------------------------------------------------------------------------
    
    private void widgets()
    {
        JPanel p = new JPanel(new GridLayout(3, 1));
        mix = new JLabel();
        red = new JScrollBar();
        green = new JScrollBar();
        blue = new JScrollBar();
        p.add(red);
        p.add(green);
        p.add(blue);
        add(mix,BorderLayout.CENTER);
        add(p,BorderLayout.SOUTH);
    }
    
    //--------------------------------------------------------------------------
    
    private void events()
    {
        
    }   
    
    
}
