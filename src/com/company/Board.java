package com.company;

import javax.swing.*;
import java.awt.*;

public class Board {
    public Board() {
        JFrame frame = new JFrame("Breakout"); //Create frame with title
        frame.setBounds(10, 10, 512, 512); // Set bounds
        JPanel panel = new JPanel(){
            public void paint(Graphics g){
                g.setColor(Color.green);
                g.fillRect(200,200,64,10);
            }
        }; // New panel
        Gameplay gp = new Gameplay();
        frame.add(gp);
        frame.add(panel); // Add panel to frame
        frame.setDefaultCloseOperation(3); // Set operators for window
        frame.setVisible(true); //Set visibility to true


    }

}
