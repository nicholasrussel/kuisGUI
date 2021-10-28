/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import javax.swing.*;
/**
 *
 * @author Nicholas Russel
 */
public class DefaultSetting {
    public JFrame defaultFrame() {
        //declare frame
        JFrame frame = new JFrame("Minimarket");

        //initialize frame
        frame.setLayout(null);
        frame.setVisible(true);
        return frame;
    }

    public JPanel defaultPanel() {
        //declare panel
        JPanel panel = new JPanel();

        //initialize panel
        panel.setLayout(null);
        panel.setVisible(true);
        return panel;
    }
}
