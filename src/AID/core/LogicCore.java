package AID.core;

import AID.core.linux.LinuxLogicCore;
import AID.io.IOOperation;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by dima-sv on 2/3/15.
 */
public class LogicCore {
    private static final Logger logger = Logger.getLogger(LogicCore.class);
    static LinuxLogicCore linuxLogicCore = new LinuxLogicCore();

    public static void logicCore(String inputText) {
        HashMap<String, List<String>> sysProp = null;
        try {
            sysProp = IOOperation.loadProperties("src/resources/configuration/System.properties");
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("Problem with file " + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            logger.error(e);
        }

        if (sysProp.get("systType").get(0).toString().toLowerCase().contains("linux")) {
            try {
                linuxLogicCore.whatDoing(inputText);
            } catch (Exception e) {
                e.printStackTrace();
                logger.error(e);
            }

        } else if (sysProp.get("systType").get(0).toString().toLowerCase().contains("windows")) {

        }


//        System.out.println(sysProp.get("systType").get(0).toString());
//
//        for (String key : sysProp.keySet()) {
//            String text=key+": "+sysProp.get(key).get(0);
//            System.out.println(text);
//        }
    }
}
