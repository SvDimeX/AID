package AID.form;

import com.sun.awt.AWTUtilities;
import org.apache.log4j.Logger;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dima-sv on 2/10/15.
 */
public class CursorGrid extends JDialog {
    private static final Logger log = Logger.getLogger(MainForm.class);
    public CursorGrid() {
//        super("Main Form");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLayout(null);
        setSize(dim.width, dim.height);
        setLocation(0, 0);
        setResizable(false);
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        setType(javax.swing.JFrame.Type.UTILITY);
//        setShape(new Ellipse2D.Double(0,0,getWidth(),getHeight()));
        log.info("TRANSLUCENT supported:         " + AWTUtilities.isTranslucencySupported(AWTUtilities.Translucency.TRANSLUCENT));
        log.info("PERPIXEL_TRANSPARENT supported: " + AWTUtilities.isTranslucencySupported(AWTUtilities.Translucency.PERPIXEL_TRANSPARENT));
        log.info("PERPIXEL_TRANSLUCENT supported: " + AWTUtilities.isTranslucencySupported(AWTUtilities.Translucency.PERPIXEL_TRANSLUCENT));

        String arg = "src/resources/png/cursor_grid.png";
//        String arg = "src/resources/gif/Intro.gif";
        ImageIcon icon = new ImageIcon(arg);
//        setIconImage(icon.getImage());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0, 0));
        JLabel label = new JLabel(icon);
        label.setIcon(icon);// your image here
        panel.add(label);
        label.setLocation(120, 120);
        setContentPane(panel);
        setUndecorated(true);
        pack();
        setVisible(true);


    }
}
