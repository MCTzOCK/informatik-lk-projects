package com.bensiebert.informatik;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            ProjectLauncherFrame.open();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ein Fehler ist aufgetreten: " + ex.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
        }
    }
}
