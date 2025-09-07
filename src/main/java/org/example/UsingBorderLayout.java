package org.example;

import javax.swing.*;
import java.awt.*;

public class UsingBorderLayout {
    public UsingBorderLayout() {
        //creation of  a frame and set a size, layout
        JFrame BorderLayoutFrame = new JFrame("BorderLayout Frame");
        BorderLayoutFrame.setSize(1000,700);
        BorderLayoutFrame.setLayout(new BorderLayout());

        //enable frame decoration
        JFrame.setDefaultLookAndFeelDecorated(true);

        //creation of buttons
        JButton north = new JButton("My Music Genre");
        JButton south = new JButton("Rap Music");
        JButton east = new JButton("Ballads Music");
        JButton west = new JButton("Gospel Music");
        //make button text bold
        Font boldString = new Font("Arial", Font.BOLD,16);
        north.setFont(boldString);

        //add different buttons to the layout
        BorderLayoutFrame.add(north, BorderLayout.NORTH);
        BorderLayoutFrame.add(south, BorderLayout.SOUTH);
        BorderLayoutFrame.add(east, BorderLayout.EAST);
        BorderLayoutFrame.add(west, BorderLayout.WEST);


        BorderLayoutFrame.setVisible(true);
    }
}
