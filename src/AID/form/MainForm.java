package AID.form;

import com.sun.awt.AWTUtilities;
import org.apache.log4j.Logger;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dima-sv on 2/3/15.
 */
public class MainForm extends JDialog{
    private static final Logger logger = Logger.getLogger(MainForm.class);
    public MainForm() {
//        super("Main Form");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLayout(null);
        setSize(380, 380);
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setResizable(false);
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        setType(javax.swing.JFrame.Type.UTILITY);
//        setShape(new Ellipse2D.Double(0,0,getWidth(),getHeight()));
        logger.warn("TRANSLUCENT supported:         " + AWTUtilities.isTranslucencySupported(AWTUtilities.Translucency.TRANSLUCENT));
        logger.warn("PERPIXEL_TRANSPARENT supported: " + AWTUtilities.isTranslucencySupported(AWTUtilities.Translucency.PERPIXEL_TRANSPARENT));
        logger.warn("PERPIXEL_TRANSLUCENT supported: " + AWTUtilities.isTranslucencySupported(AWTUtilities.Translucency.PERPIXEL_TRANSLUCENT));

        String arg = "src/resources/png/AID.png";
//        String arg = "src/resources/gif/Intro.gif";
        ImageIcon icon = new ImageIcon(arg);
//        setIconImage(icon.getImage());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0,0,0,0));
        JLabel label = new JLabel(icon);
        label.setIcon(icon);// your image here
        panel.add(label);
        label.setLocation(120,120);
        setContentPane(panel);
        setUndecorated(true);
        pack();
        setVisible(true);

    }
}
