package AID.form;

import AID.io.GenerateJSGF;
import org.apache.log4j.Logger;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dima-sv on 24.02.15.
 */
public class ConfigurationForm extends JFrame {
    private static final Logger logger = Logger.getLogger(ConfigurationForm.class);
    private static GenerateJSGF generateJSGF=new GenerateJSGF();
    public ConfigurationForm(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLayout(null);
        setSize(800, 600);
        setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setResizable(false);


        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
