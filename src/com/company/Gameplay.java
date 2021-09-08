package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gameplay extends JPanel{


    public Gameplay(){
        KeyListener listener = new KeyListener() {
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));

            }

            @Override
            public void keyReleased(KeyEvent e) {
                //System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
            }
        };
        addKeyListener(listener);
        setFocusable(true);
    }

    public void actionPerformed(ActionEvent e){
        //b.setText("Welcome to Javatpoint.");
    }
}
