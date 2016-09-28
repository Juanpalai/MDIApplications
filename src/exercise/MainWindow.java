/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author oop
 */
public class MainWindow extends JFrame
{
    private JMenuBar menu;
    private JMenu file, edit, exercises,help;
    private JMenuItem open, quit;
    private JDesktopPane mdi;
    //--------------------------------------------------------------------------
        
    public MainWindow()
    {
        super("Application MDI");
        setSize(600, 400);
        widgets();
        events();
        setVisible(true);       
        
    }
    //--------------------------------------------------------------------------
    private void widgets()
    {
        menu = new JMenuBar();
        file = new JMenu("FIle");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        open = new JMenuItem("Open");
        quit = new JMenuItem("Exit");
        mdi = new JDesktopPane();
        
        setJMenuBar(menu);
        menu.add(file);
        menu.add(edit);
        menu.add(help);        
        file.add(open);
        file.addSeparator();
        file.add(quit);
        
        add(mdi);       
        
        
        
    }
    //--------------------------------------------------------------------------
    private void events()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //----------------------------------------------------------------------
        open.addActionListener(new ActionListener(){
            public void  actionPerformed(ActionEvent e){
                JInternalFrame child = new JInternalFrame("Untitle 1");
                child.setSize(400, 300);
                child.setVisible(true);
                mdi.add(child);
            }            
        });
        
    }
    //--------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        new MainWindow();
        
    }
    
}
