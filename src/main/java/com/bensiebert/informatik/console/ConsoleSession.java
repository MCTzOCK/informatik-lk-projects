package com.bensiebert.informatik.console;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ConsoleSession {

    public ArrayList<String> history = new ArrayList<>();
    public String name;
    public JTextArea textArea;

    public ConsoleSession(String name) {
        this.name = name;
    }

    public void println(String text) {
        history.add(text);
        textArea.setText(String.join("\n", history));
    }

    public void showConsoleSession() {
        JFrame jf = new JFrame("Konsolenausgabe - " + this.name);

        this.textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 20));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);

        jf.getContentPane().add(scrollPane);

        jf.setSize(500, 400);
        jf.setLocation(400, 200);
        jf.setVisible(true);
    }

}
