package AID.form;

import org.apache.log4j.Logger;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dima-sv on 2/19/15.
 */
public class SystemPropForm extends JFrame {
    private static final Logger log = Logger.getLogger(SystemPropForm.class);

    public SystemPropForm() {
//        super("Main Form");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLayout(null);
        setSize(800, 600);
        setLocation(200, 200);
        setResizable(false);
        setVisible(true);


    }
}
