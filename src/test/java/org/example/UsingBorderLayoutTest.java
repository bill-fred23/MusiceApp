package org.example;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class UsingBorderLayoutTest {

    @Test
    void testUsingBorderLayoutCreation() {
        assertDoesNotThrow(UsingBorderLayout::new);
    }

    @Test
    void testFrameAndButtonsExist() {
        UsingBorderLayout layout = new UsingBorderLayout();

        Frame[] frames = Frame.getFrames();
        assertTrue(frames.length > 0, "No frames were created");

        JFrame frame = null;
        for (Frame f : frames) {
            if (f instanceof JFrame) {
                frame = (JFrame) f;
                break;
            }
        }
        assertNotNull(frame, "JFrame should be created");

        Component[] components = frame.getContentPane().getComponents();
        assertTrue(components.length > 0, "Frame should have components");
        
        boolean hasNorth = false, hasSouth = false, hasEast = false, hasWest = false;
        for (Component comp : components) {
            if (comp instanceof JButton) {
                String text = ((JButton) comp).getText();
                switch (text) {
                    case "My Music Genre" -> hasNorth = true;
                    case "Rap Music" -> hasSouth = true;
                    case "Ballads Music" -> hasEast = true;
                    case "Gospel Music" -> hasWest = true;
                }
            }
        }

        assertTrue(hasNorth, "North button should exist");
        assertTrue(hasSouth, "South button should exist");
        assertTrue(hasEast, "East button should exist");
        assertTrue(hasWest, "West button should exist");
    }
}
