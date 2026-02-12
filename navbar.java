import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NavBarApp {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Whtsgoodinthehood");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create menu bar (acts like navbar)
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.CYAN);

        // Create menu items
        JMenu menu = new JMenu("Menu");

        JMenuItem home = new JMenuItem("Home");
        JMenuItem about = new JMenuItem("About");
        JMenuItem services = new JMenuItem("Services");
        JMenuItem contact = new JMenuItem("Contact");

        // Add action listeners
        home.addActionListener(e ->
            JOptionPane.showMessageDialog(frame, "Home Clicked!")
        );

        about.addActionListener(e ->
            JOptionPane.showMessageDialog(frame, "About Clicked!")
        );

        services.addActionListener(e ->
            JOptionPane.showMessageDialog(frame, "Services Clicked!")
        );

        contact.addActionListener(e ->
            JOptionPane.showMessageDialog(frame, "Contact Clicked!")
        );

        // Add items to menu
        menu.add(home);
        menu.add(about);
        menu.add(services);
        menu.add(contact);

        menuBar.add(menu);

        // Set menu bar to frame
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}
