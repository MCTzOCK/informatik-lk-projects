package com.bensiebert.informatik;

import com.bensiebert.informatik.ui.StyledButtonUI;
import org.reflections.Reflections;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Set;

public class ProjectLauncherFrame {

    public static void open() throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        JFrame jf = new JFrame("Informatik LK");
        jf.setSize(500, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();

        Set<Class<? extends Project>> projectClasses =
                new Reflections("com.bensiebert.informatik.projects")
                        .getSubTypesOf(Project.class);

        ArrayList<Project> projects = new ArrayList<>();

        projectClasses.forEach(projectClass -> {
            try {
                Project pr = projectClass.getDeclaredConstructor().newInstance();

                projects.add(pr);
                System.out.println("Loaded project: " + pr.name);

            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

        panel.setLayout(new GridLayout(0, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        projects.forEach(project -> {
            JButton button = new JButton(project.name);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.setBackground(Color.GRAY);
            button.setUI(new StyledButtonUI());
            button.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            button.addActionListener(e -> {
                try {
                    for(Argument arg: project.args) {
                        String value = JOptionPane.showInputDialog(null, arg.description, arg.name, JOptionPane.QUESTION_MESSAGE);
                        if(value == null || value.equals("")) {
                            return;
                        }
                        arg.value = value;
                    }

                    project.launch();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ein Fehler ist aufgetreten: " + ex.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
                }
            });
            panel.add(button);
        });



        jf.getContentPane().add(new JScrollPane(panel));
        jf.setLocation(200, 200);
        jf.setResizable(false);
        jf.setVisible(true);
    }

}

